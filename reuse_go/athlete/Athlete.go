// Package athlete provides the struct reusability by composition.
package athlete

import "fmt"

// Athlete is a base struct representing an athlete.
type Athlete struct {
	Speciality string
}

// MySpeciality retrieves the speciality of the athlete.
func (a *Athlete) MySpeciality() string {
	return "My speciality is " + a.Speciality + "."
}

// Sprinter is a struct representing a Sprinter, utilizing composition with the Athlete class.
type Sprinter struct {
	Firstname string
	Lastname  string
	Athlete   Athlete
}

// Display displays the information of the Sprinter including their full name and speciality.
func (s *Sprinter) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		s.Firstname,
		s.Lastname,
		s.Athlete.MySpeciality(),
	)
}

// Thrower is a struct representing a Thrower, utilizing composition with the Athlete class.
type Thrower struct {
	Firstname string
	Lastname  string
	Athlete   Athlete
}

// Display displays the information of the Thrower including their full name and speciality.
func (t *Thrower) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		t.Firstname,
		t.Lastname,
		t.Athlete.MySpeciality(),
	)
}
