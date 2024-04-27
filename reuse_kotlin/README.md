# Kotlin Athlete Project

This project demonstrates various implementations of athletes using Kotlin, focusing on reusability through inheritance
and composition.

## Overview

The project consists of several Kotlin classes demonstrating different approaches to modeling athletes:

- `Athlete`: Represents the base class for athletes.
- `Sprinter`: Inherits from `Athlete` class.
- `Thrower`: Utilizes composition with the `Athlete` class.
- `AthleteInterface`: Represents an interface for athletes.
- `AthleteImpl`: Implements the `AthleteInterface`.
- `DistanceRunner`: Utilizes composition with the `AthleteInterface`.
- `Jumper`: Utilizes composition with the `AthleteInterface`.

## Usage

The `main` function in the `Main.kt` file demonstrates how to create instances of different athlete types and display
their information.

To run the project, execute the following command:

```bash
./gradlew run
```

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and
submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.