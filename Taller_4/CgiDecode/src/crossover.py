from random import random
from typing import List, Tuple

from src.individual import Individual


def single_point_crossover(parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza un cruce de un punto entre dos padres.
    """
    
    gen11 = parent1.test_suite[:len(parent1.test_suite)//2]
    gen12 = parent1.test_suite[len(parent1.test_suite)//2:]

    gen21 = parent2.test_suite[:len(parent2.test_suite)//2]
    gen22 = parent2.test_suite[len(parent2.test_suite)//2:]

    offspring1 = Individual(gen11 + gen22)
    offspring2 = Individual(gen21 + gen12)

    return offspring1, offspring2


def crossover(crossover_function, crossover_prob, parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza el cruce entre dos padres, dada una probabilidad.
    """
    if random() < crossover_prob:
        offspring1, offspring2 = crossover_function(parent1, parent2)
    else:
        offspring1, offspring2 = parent1, parent2

    return offspring1, offspring2