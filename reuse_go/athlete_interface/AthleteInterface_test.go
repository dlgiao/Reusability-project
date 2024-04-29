package athlete_interface

import (
	"os"
	"testing"
)

func TestBaseAthlete_MySpeciality(t *testing.T) {
	baseAthlete := BaseAthlete{Speciality: "my speciality"}

	// Call the MySpeciality method on the Athlete
	result := baseAthlete.MySpeciality()

	// Check if the result matches the expected value
	expected := "My speciality is my speciality."
	if result != expected {
		t.Errorf("My speciality is my speciality. Expected %s, got %s", expected, result)
	}
}

func TestDistanceRunner_Display(t *testing.T) {
	distanceRunner := DistanceRunner{
		Firstname: "Eliud",
		Lastname:  "Kipchoge",
		Athlete:   BaseAthlete{Speciality: "marathon"},
	}

	expected := "My name is Eliud Kipchoge. My speciality is marathon.\n"
	output := captureOutput(func() {
		distanceRunner.Display()
	})

	if output != expected {
		t.Errorf("Expected output %s, but got %s", expected, output)
	}
}

// captureOutput captures the output of a function and returns it as a string.
func captureOutput(f func()) string {
	old := os.Stdout // keep backup of the real stdout
	r, w, _ := os.Pipe()
	os.Stdout = w

	outC := make(chan string)
	go func() {
		var buf []byte
		buf = make([]byte, 1024)
		n, _ := r.Read(buf)
		outC <- string(buf[:n])
	}()

	f()

	err := w.Close()
	if err != nil {
		return ""
	}
	os.Stdout = old // restoring the real stdout
	out := <-outC

	return out
}
