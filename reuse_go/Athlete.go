package main

import "fmt"

type Athlete struct {
	speciality string
}

func (a *Athlete) MySpeciality() string {
	return "My speciality is " + a.speciality + "."
}

type Sprinter struct {
	firstName string
	lastName  string
	athlete   Athlete
}

func (s *Sprinter) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		s.firstName,
		s.lastName,
		s.athlete.MySpeciality(),
	)
}
