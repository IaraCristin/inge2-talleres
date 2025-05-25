from random import choice
from string import printable
from typing import List
import random

from src.individual import Individual


def get_random_character() -> str:
    return choice(printable)


def create_test_case() -> str:
    
    nCharacters = random.randint(0,10)

    testCase = ""

    for _ in range(nCharacters): testCase += get_random_character()

    return testCase


def create_individual() -> Individual:
    
    nTestCases = random.randint(1,15)

    testCases = []

    for _ in range(nTestCases): testCases.append(create_test_case())


    return Individual(testCases)


def create_population(population_size: int) -> List[Individual]:
    population = []
    
    for _ in range(population_size): population.append(create_individual())

    return population
