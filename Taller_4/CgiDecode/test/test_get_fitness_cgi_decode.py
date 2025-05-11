#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode
from src.evaluate_condition import clear_maps

from src.individual import Individual


class TestGetFitnessCgiDecode(unittest.TestCase):

    def tearDown(self): clear_maps()

    def test_percent_AA(self):
        individual = Individual(["%AA"])
        self.assertEqual(get_fitness_cgi_decode(individual), 2.357142857142857)

    def test_percent_AU(self):
        individual = Individual(["\%AU"])
        self.assertEqual(get_fitness_cgi_decode(individual), 3.03021978021978)

    def test_percent_UU(self):
        individual = Individual(["\%UU"])
        self.assertEqual(get_fitness_cgi_decode(individual), 4.53021978021978)

    def test_plus(self):
        individual = Individual(["+"])
        self.assertEqual(get_fitness_cgi_decode(individual), 6.5)

    def test_hello_plus_reader(self):
        individual = Individual(["Hello+Reader"])
        self.assertEqual(get_fitness_cgi_decode(individual), 4.972222222222222)

    def test_empty_string(self):
        individual = Individual([""])
        self.assertEqual(get_fitness_cgi_decode(individual), 8.5)

    def test_percent_A(self):
        individual = Individual(["%A"])
        self.assertEqual(get_fitness_cgi_decode(individual), 6.023809523809524)

    def test_mixed_inputs_zero_fitness(self):
        individual = Individual(["%A", "%", "\%1+", "%+1", "a+%AA"])
        self.assertEqual(get_fitness_cgi_decode(individual), 0)

    def test_percent(self):
        individual = Individual(["%"])
        self.assertEqual(get_fitness_cgi_decode(individual), 5.857142857142858)

    def test_individual_with_empty_string(self):
        individual = Individual([""])
        self.assertEqual(get_fitness_cgi_decode(individual), 8.5)