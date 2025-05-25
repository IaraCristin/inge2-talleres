#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm
from src.get_fitness_cgi_decode import get_fitness_cgi_decode
from src.evaluate_condition import get_true_distance, get_false_distance, has_reached_condition
from src.individual import Individual

def calculate_coverage(individual: Individual) -> float:
    get_fitness_cgi_decode(individual)
    coverage = 0
    
    for i in range(1, 6):
        if has_reached_condition(i):
            if get_false_distance(i) == 0:
                coverage += 1
            if get_true_distance(i) == 0:
                coverage += 1
    
    return coverage / (5 * 2)

class TestGeneticAlgorithm(unittest.TestCase):
    
    def test1(self):
        seed(1)
        ga = GeneticAlgorithm()
        
        result = ga.run()
        
        self.assertEqual(0, result.get_fitness())
        self.assertEqual(1, calculate_coverage(result))
        self.assertEqual(4, ga.get_generation())

    def test2(self):
        seed(42)
        ga = GeneticAlgorithm()
        
        result = ga.run()
        
        self.assertEqual(0, result.get_fitness())
        self.assertEqual(1, calculate_coverage(result))
        self.assertEqual(4, ga.get_generation())

    def test3(self):
        seed(37)
        ga = GeneticAlgorithm()
        
        result = ga.run()
        
        self.assertAlmostEqual(0, result.get_fitness())
        self.assertEqual(1, calculate_coverage(result))
        self.assertEqual(28, ga.get_generation())