#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    
    def tearDown(self):
        
        clear_maps()

    def assert_decode(self, encoded: str, expected: str):

        self.assertEqual(cgi_decode_instrumented(encoded), expected)

    def assert_distances(self, condition_num: int, true_distance: int, false_distance: int):

        self.assertEqual(get_true_distance(condition_num), true_distance)
        self.assertEqual(get_false_distance(condition_num), false_distance)

    def assert_distances_are_none(self, condition_num: int):

        self.assertIsNone(get_true_distance(condition_num))
        self.assertIsNone(get_false_distance(condition_num))

    def test_string_with_no_special_character(self):

        encoded = "HelloWorld"
        expected = cgi_decode(encoded)
        self.assert_decode(encoded, expected)

        self.assert_distances(1, 0, 0)
        self.assert_distances(2, 29, 0)
        self.assert_distances(3, 35, 0)
        self.assert_distances_are_none(4)
        self.assert_distances_are_none(5)

    def test_string_with_encoded_spaces(self):

        encoded = "Hello+World"
        expected = cgi_decode(encoded)
        self.assert_decode(encoded, expected)

        self.assert_distances(1, 0, 0)
        self.assert_distances(2, 0, 0)
        self.assert_distances(3, 35, 0)
        self.assert_distances_are_none(4)
        self.assert_distances_are_none(5)

    def test_string_with_hex_value(self):

        encoded = "Hello%AA"
        expected = cgi_decode(encoded)
        self.assert_decode(encoded, expected)

        self.assert_distances(1, 0, 0)
        self.assert_distances(2, 6, 0)
        self.assert_distances(3, 0, 0)
        self.assert_distances(4, 0, 1)
        self.assert_distances(5, 0, 1)

    def test_raise_error_with_invalid_first_digit_hex_value(self):

        encoded = "Hello%PA"

        with self.assertRaises(ValueError) as e: cgi_decode_instrumented(encoded)

        self.assertEqual(e.exception.args[0], "Invalid encoding: digit high is not a hex digit")

        self.assert_distances(1, 0, 3)
        self.assert_distances(2, 6, 0)
        self.assert_distances(3, 0, 0)
        self.assert_distances(4, 10, 0)
        self.assert_distances_are_none(5)

    def test_raise_error_with_invalid_second_digit_hex_value(self):

        encoded = "Hello%AP"

        with self.assertRaises(ValueError) as e: cgi_decode_instrumented(encoded)

        self.assertEqual(e.exception.args[0], "Invalid encoding: digit low is not a hex digit")

        self.assert_distances(1, 0, 3)
        self.assert_distances(2, 6, 0)
        self.assert_distances(3, 0, 0)
        self.assert_distances(4, 0, 1)
        self.assert_distances(5, 10, 0)
