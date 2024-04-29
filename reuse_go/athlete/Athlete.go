package athlete

import "fmt"

type Athlete struct {
	Speciality string
}

func (a *Athlete) MySpeciality() string {
	return "My speciality is " + a.Speciality + "."
}

type Sprinter struct {
	FirstName string
	LastName  string
	Athlete   Athlete
}

func (s *Sprinter) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		s.FirstName,
		s.LastName,
		s.Athlete.MySpeciality(),
	)
}

type Thrower struct {
	FirstName string
	LastName  string
	Athlete   Athlete
}

func (t *Thrower) Display() {
	fmt.Printf("My name is %s %s. %v\n",
		t.FirstName,
		t.LastName,
		t.Athlete.MySpeciality(),
	)
}
