package athlete

import "fmt"

type Athlete struct {
	Speciality string
}

func (a *Athlete) MySpeciality() string {
	return "My speciality is " + a.Speciality + "."
}

type Sprinter struct {
	Firstname string
	Lastname  string
	Athlete   Athlete
}

func (s *Sprinter) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		s.Firstname,
		s.Lastname,
		s.Athlete.MySpeciality(),
	)
}

type Thrower struct {
	Firstname string
	Lastname  string
	Athlete   Athlete
}

func (t *Thrower) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		t.Firstname,
		t.Lastname,
		t.Athlete.MySpeciality(),
	)
}
