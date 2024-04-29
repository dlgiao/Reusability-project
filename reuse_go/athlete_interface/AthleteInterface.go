// Package athlete_interface provides the struct reusability by composition with an interface.
package athlete_interface

import "fmt"

// AthleteInterface is the interface representing an athlete.
type AthleteInterface interface {
	MySpeciality() string
}

// BaseAthlete is the implementation of the AthleteInterface representing an athlete.
type BaseAthlete struct {
	Speciality string
}

// MySpeciality retrieves the speciality of the athlete.
func (baseAthlete BaseAthlete) MySpeciality() string {
	return "My speciality is " + baseAthlete.Speciality + "."
}

// DistanceRunner is a struct representing a distance runner utilizing composition with the AthleteInterface.
type DistanceRunner struct {
	Firstname string
	Lastname  string
	Athlete   AthleteInterface
}

// Display displays the information of the distance runner including their full name and speciality.
func (d *DistanceRunner) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		d.Firstname,
		d.Lastname,
		d.Athlete.MySpeciality(),
	)
}

// Jumper is a struct representing a jumper utilizing composition with the AthleteInterface.
type Jumper struct {
	Firstname string
	Lastname  string
	Athlete   AthleteInterface
}

// Display displays the information of the distance runner including their full name and speciality.
func (j *Jumper) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		j.Firstname,
		j.Lastname,
		j.Athlete.MySpeciality(),
	)
}
