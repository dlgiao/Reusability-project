# Structs Reusability Project

This project demonstrates different approaches to reusing structs in Python, including composition, and composition with interfaces.

## Overview

In software development, reusability is a crucial concept that allows developers to efficiently use existing code in new contexts. Go offers several mechanisms for reusing classes, each with its own advantages and use cases.

This project showcases four athlete types: Sprinter, Thrower, DistanceRunner, and Jumper. Each athlete type is implemented using different reuse techniques.

## Techniques Demonstrated

### 1. Composition

Composition involves constructing objects by combining multiple classes, where one class contains an instance of another class. The `Sprinter` and `Thrower` structs in this project uses composition by holding a reference to an `Athlete` object.

### 2. Composition with Interfaces

Composition with interfaces allows classes to implement common behavior defined by an interface. The `DistanceRunner` and `Jumper` structs in this project implement the `AthleteInterface` to achieve reusability through interfaces.

## Project Structure

The project is structured as follows:

- `Athlete`: Defines a base class for an athlete profile.
- `Sprinter`: Represents a sprinter athlete, utilizing inheritance.
- `Thrower`: Represents an athlete specializing in throwing, utilizing composition.
- `AthleteInterface`: Defines an interface for retrieving an athlete's specialty.
- `BaseAthlete`: Defines a base class implementing the `AthleteInterface`.
- `DistanceRunner`: Represents an athlete specializing in distance running, utilizing composition with interfaces.
- `Jumper`: Represents an athlete specializing in jumping, also utilizing composition with interfaces.
- `main`: Contains the `main` method to demonstrate the usage of different athlete classes.

## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
go mod init kmmania.com/reuse_go
go run main.go
```

This will execute the main function in main.go.

### Running Unit Tests

Explore the comprehensive unit tests included in the project to ensure reliability and robustness. To execute them, simply run:

```bash
go test ./...
```

## Building and Running with Docker

The project includes a Dockerfile for containerization. To build an image and run the project within a container, execute the following commands:

```bash
docker build -t reuse_go .
docker run -it --rm reuse_go
```

## Dependencies

This project has no external dependencies beyond Go itself.

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.