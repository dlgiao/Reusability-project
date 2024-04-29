package main

import (
	"kmmania.com/reuse_go/athlete"
	"kmmania.com/reuse_go/athlete_interface"
)

// main is the entry point of the program.
// A sample client demonstrating different implementations of athletes.
func main() {
	// Creating a sprinter instance
	usain := athlete.Sprinter{
		Firstname: "Usain",
		Lastname:  "Bolt",
		Athlete:   athlete.Athlete{Speciality: "sprinting"},
	}
	usain.Display()

	// Creating a thrower instance
	ryan := athlete.Thrower{
		Firstname: "Ryan",
		Lastname:  "Crouser",
		Athlete: athlete.Athlete{
			Speciality: "shot put",
		},
	}
	ryan.Display()

	// Creating a distance runner instance
	eliud := athlete_interface.DistanceRunner{
		Firstname: "Eliud",
		Lastname:  "Kipchoge",
		Athlete:   athlete_interface.BaseAthlete{Speciality: "marathon"},
	}
	eliud.Display()

	// Creating a jumper instance
	marco := athlete_interface.Jumper{
		Firstname: "Marco",
		Lastname:  "Tamberi",
		Athlete:   athlete_interface.BaseAthlete{Speciality: "high jump"},
	}
	marco.Display()
}
