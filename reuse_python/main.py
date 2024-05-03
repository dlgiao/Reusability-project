"""
Classes Reusability Project

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
from src.athlete_base import AthleteBase
from src.distance_runner import DistanceRunner
from src.jumper import Jumper
from src.sprinter import Sprinter
from src.thrower import Thrower

if __name__ == "__main__":
    """
    Main entry point for the program.
    """
    # Creating a Sprinter instance
    usain = Sprinter("Usain", "Bolt", "sprinting")
    # Displaying information about the Sprinter
    usain.display()

    # Creating a Thrower instance
    ryan = Thrower("Ryan", "Crouser", Athlete("shot put"))
    # Displaying information about the Thrower
    ryan.display()

    # Creating a DistanceRunner instance
    eliud = DistanceRunner("Eliud", "Kipchoge", AthleteBase("marathon"))
    # Displaying information about the DistanceRunner
    eliud.display()

    # Creating a Jumper instance
    marco = Jumper("Marco", "Tamberi", AthleteBase("high jump"))
    # Displaying information about the Jumper
    marco.display()
