from src.athlete import Athlete
from src.athlete_base import AthleteBase
from src.distance_runner import DistanceRunner
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
