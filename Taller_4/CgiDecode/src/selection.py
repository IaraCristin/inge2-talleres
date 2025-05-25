from random import sample
from typing import Tuple, List
from src.individual import Individual


def tournament_selection(population: List[Individual], tournament_size: int) -> Individual:
    """
    Selecciona un individuo de la poblacion usando seleccion por torneo.
    El tamaño del torneo es el número de individuos que competiran en el mismo.
    """
    
    warriors = sample(population, tournament_size)

    bestFitness = warriors[0].get_fitness()
    winner = warriors[0]

    for warrior in warriors:

        currentFitness = warrior.get_fitness()

        if currentFitness < bestFitness:

            bestFitness = currentFitness
            winner = warrior

    return winner


def selection(selection_function, tournament_size: int, population: list[Individual]) -> Tuple[Individual, Individual]:
    """
    Selecciona dos individuos de la poblacion usando seleccion por torneo.
    """
    parent1 = selection_function(population, tournament_size)
    parent2 = selection_function(population, tournament_size)

    return parent1, parent2
