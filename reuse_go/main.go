package main

import (
	"kmmania.com/reuse_go/athlete"
	"kmmania.com/reuse_go/athlete_interface"
)

func main() {
	usain := athlete.Sprinter{
		Firstname: "Usain",
		Lastname:  "Bolt",
		Athlete:   athlete.Athlete{Speciality: "sprinting"},
	}
	usain.Display()

	ryan := athlete.Thrower{
		Firstname: "Ryan",
		Lastname:  "Crouser",
		Athlete: athlete.Athlete{
			Speciality: "shot put",
		},
	}
	ryan.Display()

	eliud := athlete_interface.DistanceRunner{
		Firstname: "Eliud",
		Lastname:  "Kipchoge",
		Athlete:   athlete_interface.BaseAthlete{Speciality: "marathon"},
	}
	eliud.Display()

	marco := athlete_interface.Jumper{
		Firstname: "Marco",
		Lastname:  "Tamberi",
		Athlete:   athlete_interface.BaseAthlete{Speciality: "high jump"},
	}
	marco.Display()
}
