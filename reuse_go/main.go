package main

import (
	"kmmania.com/reuse_go/athlete"
)

func main() {
	usain := athlete.Sprinter{
		FirstName: "Usain",
		LastName:  "Bolt",
		Athlete:   athlete.Athlete{Speciality: "sprinting"},
	}
	usain.Display()
}
