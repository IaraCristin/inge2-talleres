from typing import List

from src.cgi_decode_instrumented import cgi_decode_instrumented

from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance
from src.individual import Individual


def get_normalized_fitness(fitness: int)-> float:

    if fitness == None: fitness = 1
    else: fitness = fitness/(fitness+1)

    return fitness

def get_fitness_cgi_decode(individual: Individual) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    # Recuerden que los diccionarios true_distances y false_distances son globales
    clear_maps()

    fitness = 0
    
    for test_case in individual.test_suite:

        try: cgi_decode_instrumented(test_case)
        except: pass

    for condition_num in range(1,6):

        fitness += get_normalized_fitness(get_true_distance(condition_num))
        fitness += get_normalized_fitness(get_false_distance(condition_num))

    return fitness
