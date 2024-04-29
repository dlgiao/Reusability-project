package reuse_go

type Athlete struct {
	speciality string
}

func (a *Athlete) MySpeciality() string {
	return "My speciality is " + a.speciality + "."
}
