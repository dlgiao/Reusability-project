"""
Athlete Reusability Project

This project demonstrates different ways to reuse classes in Python:
- Inheritance
- Composition
- Composition through interface implementation

Classes:
    Athlete: Represents an athlete with a specific specialty.
    Sprinter: Represents a sprinter, inheriting from Athlete.
    Thrower: Represents a thrower, utilizing Athlete class through composition.
    AthleteInterface: Interface defining the method for athlete specialty.
    AthleteImpl: Class implementing the AthleteInterface.
    DistanceRunner: Represents a distance runner, using Athlete interface through composition.
    Jumper: Represents a jumper, using Athlete interface through composition.

Usage:
    Import the required classes and create instances of different types of athletes.
    Each athlete instance can display information about themselves using the `display()` method.


Author: Dac Linh Giao NGUYEN
Date: 2024

"""
from src.athlete import Athlete


class Thrower:
    """Class representing a thrower.

    Attributes:
        first_name (str): The first name of the thrower.
        last_name (str): The last name of the thrower.
        athlete (Athlete): An Athlete object representing the thrower's specialty.

    Methods:
        display(): Displays information about the thrower, including their full name and specialty.
    """

    def __init__(self, first_name, last_name, athlete):
        """
        Initializes a Thrower object with a given first name, last name, and athlete.

        Args:
            first_name (str): The first name of the thrower.
            last_name (str): The last name of the thrower.
            athlete (Athlete): An Athlete object representing the thrower's specialty.
        """
        self.first_name = first_name
        self.last_name = last_name
        self.athlete = athlete

    def display(self):
        """
        Displays information about the thrower.

        Returns:
            None
        """
        print(f"My name is {self.first_name} {self.last_name}. {self.athlete.my_speciality()}")
