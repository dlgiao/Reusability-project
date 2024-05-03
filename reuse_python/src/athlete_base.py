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
from src.athlete_interface import AthleteInterface


class AthleteBase(AthleteInterface):
    """Class implementing the AthleteInterface."""

    def __init__(self, speciality):
        """
        Initializes an AthleteImpl object with a given specialty.

        Args:
            speciality (str): The specialty of the athlete.
        """
        self.speciality = speciality

    def my_speciality(self):
        """
        Returns the specialty of the athlete.

        Returns:
            str: The specialty of the athlete.
        """
        return f"My speciality is {self.speciality}."
