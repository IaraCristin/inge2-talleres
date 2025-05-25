from random import choice, randint, random
from typing import List

from src.create_population import create_test_case, get_random_character
from src.individual import Individual


def add_character(test_case: str) -> str:
    """
    Añade un caracter al azar a un test case.
    """
    test_case += get_random_character()
    return test_case


def remove_character(test_case: str) -> str:
    """
    Elimina un caracter al azar de un test case.
    """
    deleteIdx = randint(0, len(test_case)-1)

    copy_test_case = test_case

    test_case = copy_test_case[:deleteIdx] 
    
    if deleteIdx < len(copy_test_case)-1:

        test_case += copy_test_case[deleteIdx+1:]

    return test_case


def modify_character(test_case: str) -> str:
    """
    Modifica un caracter al azar de un test case.
    """
    idx = randint(0, len(test_case)-1)
    test_case[idx] = get_random_character()
    return test_case


def add_test_case(individual: Individual) -> Individual:
    """
    Añade un test case al azar a un individuo.
    """

    individual.test_suite.append(create_test_case())

    return individual


def remove_test_case(individual: Individual) -> Individual:
    """
    Elimina un test case al azar de un individuo.
    """

    test_suite = individual.test_suite

    deleteIdx = randint(0, len(test_suite)-1)

    copy_test_suite = test_suite

    test_suite = copy_test_suite[:deleteIdx]
    
    if deleteIdx < len(copy_test_suite)-1:

        test_suite += copy_test_suite[deleteIdx+1:]

    return Individual(test_suite)


def modify_test_case(individual: Individual) -> Individual:
    """
    Modifica un test case al azar de un individuo.
    """
    test_suite = individual.test_suite
    test_case_idx = randint(0, len(test_suite)-1)
    test_case = test_suite[test_case_idx]

    modifications = [modify_character]
    if len(test_case) > 0: modifications += [remove_character] 
    if len(test_case) < 10: modifications += [add_character]

    modification_func = choice(modifications)
    test_case = modification_func(test_case)
    individual.test_suite[test_case_idx] = test_case

    return individual


def mutate(individual: Individual) -> Individual:
    """
    Aplica una mutación al azar a un individuo.
    """
    test_suite = individual.test_suite

    modifications = [modify_test_case]
    if len(test_suite) > 0: modifications += [remove_test_case] 
    if len(test_suite) < 15: modifications += [add_test_case]

    modification_func = choice(modifications)
    individual = modification_func(individual)

    return individual


def mutation(mutation_function, mutation_prob, individual: Individual) -> Individual:
    """
    Muta a un individuo con una probabilidad dada.
    """
    if random() < mutation_prob: individual = mutation_function(individual)

    return individual


