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
from Athlete import Athlete


class Sprinter(Athlete):
    """Class representing a sprinter, inheriting from Athlete.

    Attributes:
        first_name (str): The first name of the sprinter.
        last_name (str): The last name of the sprinter.

    Methods:
        display(): Displays information about the sprinter, including their name and specialty.
    """

    def __init__(self, first_name, last_name, speciality):
        """
        Initializes a Sprinter object with a given first name, last name, and specialty.

        Args:
            first_name (str): The first name of the sprinter.
            last_name (str): The last name of the sprinter.
            speciality (str): The specialty of the sprinter.
        """
        super().__init__(speciality)
        self.first_name = first_name
        self.last_name = last_name

    def display(self):
        """
        Displays information about the sprinter.

        Returns:
            None
        """
        print("My name is {} {}, {}".format(self.first_name, self.last_name, super().my_speciality()))
