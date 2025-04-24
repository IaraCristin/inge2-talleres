import operator
import sys
from typing import Dict, Union

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}


def update_maps(condition_num: int, d_true: int, d_false: int):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(
            distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(
            distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num: int) -> Union[int, None]:
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num: int) -> Union[int, None]:
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num: int) -> bool:
    global distances_true, distances_false
    return condition_num in distances_true.keys() or condition_num in distances_false.keys()


def evaluate_operation(condition_num, operation, lhs, rhs, value_true_false, value_false_true):
    if operation(lhs, rhs):
        update_maps(condition_num, 0, value_true_false)
    else:
        update_maps(condition_num, value_false_true, 0)
    return operation(lhs, rhs)

def evaluate_condition_for_integers(condition_num: int, op: str, lhs: Union[str, int], rhs: Union[str, int, Dict]):
    if op == 'Eq': branch = evaluate_operation(condition_num, operator.eq, lhs, rhs, 1, abs(lhs-rhs))
    elif op == 'Ne': branch = evaluate_operation(condition_num, operator.ne, lhs, rhs, abs(lhs - rhs), 1)
    elif op == 'Lt': branch = evaluate_operation(condition_num, operator.lt, lhs, rhs, (rhs - lhs), (lhs - rhs) + 1)
    elif op == 'Gt': branch = evaluate_operation(condition_num, operator.gt, lhs, rhs, (lhs - rhs), (rhs - lhs) + 1)
    elif op == 'Le': branch = evaluate_operation(condition_num, operator.le, lhs, rhs, (rhs - lhs) + 1, (lhs - rhs))
    elif op == 'Ge': branch = evaluate_operation(condition_num, operator.ge, lhs, rhs, (lhs - rhs) + 1, (rhs - lhs))
    else: raise ValueError(f"Operation {op} not valid for integers")

    return branch

def evaluate_condition(condition_num: int, op: str, lhs: Union[str, int], rhs: Union[str, int, Dict]) -> bool:
    branch = False

    if type(lhs) == int and type(rhs) == int:
        branch = evaluate_condition_for_integers(condition_num, op, lhs, rhs)
    elif type(lhs) == str and type(rhs) == str:
        if len(lhs) == 1 and len(rhs) == 1:
            branch = evaluate_condition_for_integers(condition_num, op, ord(lhs), ord(rhs))
    elif type(lhs) == str and type(rhs) == dict:
        nearest_char_ord = sys.maxsize
        for key in rhs.keys():
            if abs(ord(lhs)-ord(key)) < abs(ord(lhs) - nearest_char_ord):
                nearest_char_ord = ord(key)
        branch = evaluate_condition_for_integers(condition_num,'Eq',ord(lhs),nearest_char_ord)
    else:
        raise ValueError(f"lhs, rhs type combination is not valid")

    return branch
