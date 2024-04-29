package athlete_interface

import "fmt"

type AthleteInterface interface {
	MySpeciality() string
}

type BaseAthlete struct {
	Speciality string
}

func (baseAthlete BaseAthlete) MySpeciality() string {
	return "My speciality is " + baseAthlete.Speciality + "."
}

type DistanceRunner struct {
	Firstname string
	Lastname  string
	Athlete   AthleteInterface
}

func (d *DistanceRunner) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		d.Firstname,
		d.Lastname,
		d.Athlete.MySpeciality(),
	)
}
