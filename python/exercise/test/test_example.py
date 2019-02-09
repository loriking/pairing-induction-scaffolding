import unittest
from exercise import example


class TestExample(unittest.TestCase):

    def test_add(self):
        self.assertEqual(5, example.add(2, 3))
