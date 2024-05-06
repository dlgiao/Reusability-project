package athlete_interface

import (
	"github.com/stretchr/testify/assert"
	"os"
	"testing"
)

func TestBaseAthlete_MySpeciality(t *testing.T) {
	// Given
	baseAthlete := BaseAthlete{Speciality: "running"}

	// When
	result := baseAthlete.MySpeciality()

	// Check if the result matches the expected value
	expected := "My speciality is running."
	assert.Equal(t, expected, result, "My speciality is running. Expected %s, got %s", expected, result)
}

func TestDistanceRunner_Display(t *testing.T) {
	// Given
	distanceRunner := DistanceRunner{
		Firstname: "Eliud",
		Lastname:  "Kipchoge",
		Athlete:   BaseAthlete{Speciality: "marathon"},
	}

	// When
	output := captureOutput(func() {
		distanceRunner.Display()
	})

	// Then
	expected := "My name is Eliud Kipchoge. My speciality is marathon.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
}

func TestJumper_Display(t *testing.T) {
	// Given
	jumper := Jumper{
		Firstname: "Marco",
		Lastname:  "Tamberi",
		Athlete:   BaseAthlete{Speciality: "high jump"},
	}

	// When
	output := captureOutput(func() {
		jumper.Display()
	})

	// Then
	expected := "My name is Marco Tamberi. My speciality is high jump.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
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
