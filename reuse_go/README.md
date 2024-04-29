# Struct Reusability Example Project

This project demonstrates the concept of struct reusability in Go through composition and composition via an interface.

## Overview

The project provides implementations for different types of athletes: Sprinter, Thrower, Distance Runner, and Jumper. The implementations showcase how struct reusability can be achieved using composition and composition via an interface.

- **Composition**: Structs like Sprinter and Thrower utilize composition with the Athlete struct to reuse its functionality.
- **Composition via Interface**: Structs like Distance Runner and Jumper utilize composition via the AthleteInterface interface to achieve polymorphism.

## Project Structure

The project is structured as follows:

reuse_go/
├── athlete/
│ ├── athlete.go
│ ├── sprinter.go
│ └── thrower.go
└── athlete_interface/
├── athlete_interface.go
├── distance_runner.go
└── jumper.go

## Usage

To use the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
go run main.go
```

This will execute the main function in main.go, demonstrating the usage of different data sources (MAS and HR) and their respective DAO and Service implementations.

## Dependencies

This project has no external dependencies beyond Go itself.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.