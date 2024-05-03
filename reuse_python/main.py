from src.athlete import Athlete
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
