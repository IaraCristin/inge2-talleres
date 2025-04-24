#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):

    def assert_decode(self, encoded: str, expected: str):

        self.assertEqual(cgi_decode(encoded), expected)

    def test_string_with_no_special_character(self):

        expected = "HelloWorld"
        self.assert_decode(expected, expected)

    def test_string_with_encoded_spaces(self):

        encoded = "Hello+World"
        expected = "Hello World"
        self.assert_decode(encoded, expected)

    def test_string_with_hex_value(self):

        encoded = "Hello%AA"
        expected = "Helloª"
        self.assert_decode(encoded, expected)

    def test_raise_error_with_invalid_first_digit_hex_value(self):

        encoded = "Hello%PA"

        with self.assertRaises(ValueError) as e: cgi_decode(encoded)

        self.assertEqual(e.exception.args[0], "Invalid encoding: digit high is not a hex digit")

    def test_raise_error_with_invalid_second_digit_hex_value(self):

        encoded = "Hello%AP"

        with self.assertRaises(ValueError) as e: cgi_decode(encoded)

        self.assertEqual(e.exception.args[0], "Invalid encoding: digit low is not a hex digit")