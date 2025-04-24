#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition, distances_true, distances_false, clear_maps
from typing import Union, Dict

class TestEvaluateCondition(unittest.TestCase):

    def assert_operation(self,
                         branch: bool, op: str,
                         lhs: Union[int,str], rhs: Union[int,str,Dict]):

        self.assertEqual(evaluate_condition(1, op, lhs, rhs), branch)

    def test_integer_equal_true(self):
        self.assert_operation(True, "Eq", 10, 10)

    def test_integer_equal_false(self):
        self.assert_operation(False, "Eq", 20, 10)

    def test_integer_not_equal_true(self):
        self.assert_operation(True, "Ne", 20, 10)

    def test_integer_not_equal_false(self):
        self.assert_operation(False, "Ne", 10, 10)

    def test_integer_less_than_true(self):
        self.assert_operation(True, "Lt", 10, 20)

    def test_integer_less_than_false(self):
        self.assert_operation(False, "Lt", 20, 10)

    def test_integer_greater_than_true(self):
        self.assert_operation(True, "Gt", 20, 10)

    def test_integer_greater_than_false(self):
        self.assert_operation(False, "Gt", 10, 20)

    def test_integer_less_equals_true(self):
        self.assert_operation(True, "Le", 10, 20)

    def test_integer_less_equals_false(self):
        self.assert_operation(False, "Le", 20, 10)

    def test_integer_greater_equals_true(self):
        self.assert_operation(True, "Ge", 20, 10)

    def test_integer_greater_equals_false(self):
        self.assert_operation(False, "Ge", 10, 20)

    #--- char tests

    def test_char_equal_true(self):
        self.assert_operation(True, "Eq", "A", "A")

    def test_char_equal_false(self):
        self.assert_operation(False, "Eq", "B","A")

    def test_char_not_equal_true(self):
        self.assert_operation(True, "Ne", "B", "A")

    def test_char_not_equal_false(self):
        self.assert_operation(False, "Ne", "A", "A")

    def test_char_less_than_true(self):
        self.assert_operation(True, "Lt", "A", "B")

    def test_char_less_than_false(self):
        self.assert_operation(False, "Lt", "B", "A")

    def test_char_greater_than_true(self):
        self.assert_operation(True, "Gt", "B", "A")

    def test_char_greater_than_false(self):
        self.assert_operation(False, "Gt", "A", "B")

    def test_char_less_equals_true(self):
        self.assert_operation(True, "Le", "A", "B")

    def test_char_less_equals_false(self):
        self.assert_operation(False, "Le", "B", "A")

    def test_char_greater_equals_true(self):
        self.assert_operation(True, "Ge", "B", "A")

    def test_char_greater_equals_false(self):
        self.assert_operation(False, "Ge", "A", "B")

    def test_dict_in_true(self):
        self.assert_operation(True,"In","A",{"A":1,"B":2})

    def test_dict_in_false(self):
        self.assert_operation(False,"In","A",{"B":1,"C":2})