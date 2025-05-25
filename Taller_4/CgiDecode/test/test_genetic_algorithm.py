#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):

    def test1(self):

        seed(1)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result.get_fitness(), 1)
        self.assertEqual(ga.generation, 0)

    def test2(self):
        
        seed(42)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result.get_fitness(), 1.4090909090909092)
        self.assertEqual(ga.generation, 0)

    def test3(self):
        
        seed(37)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result.get_fitness(), 1.25)
        self.assertEqual(ga.generation, 0)