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
    AthleteBase: Class implementing the AthleteInterface.
    DistanceRunner: Represents a distance runner, using Athlete interface through composition.
    Jumper: Represents a jumper, using Athlete interface through composition.

Usage:
    Import the required classes and create instances of different types of athletes.
    Each athlete instance can display information about themselves using the `display()` method.


Author: Dac Linh Giao NGUYEN
Date: 2024

"""


class Jumper:
    """Class representing a jumper."""

    def __init__(self, first_name, last_name, athlete):
        """
        Initializes a Jumper object with a given first name, last name, and athlete instance.

        Args:
            first_name (str): The first name of the jumper.
            last_name (str): The last name of the jumper.
            athlete (AthleteBase): An Athlete object representing the jumper's specialty.
        """
        self.first_name = first_name
        self.last_name = last_name
        self.athlete = athlete

    def display(self):
        """
        Displays information about the jumper.

        Returns:
            None
        """
        print(f"My name is {self.first_name} {self.last_name}. {self.athlete.my_speciality()}")
