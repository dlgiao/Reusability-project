package athlete_interface

import (
	"github.com/stretchr/testify/assert"
	"kmmania.com/reuse_go/utils"
	"testing"
)

func TestBaseAthlete_MySpeciality(t *testing.T) {
	// Given
	baseAthlete := BaseAthlete{Speciality: "running"}

	// When
	result := baseAthlete.MySpeciality()

	// Then
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
	output := utils.CaptureOutput(func() {
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
	output := utils.CaptureOutput(func() {
		jumper.Display()
	})

	// Then
	expected := "My name is Marco Tamberi. My speciality is high jump.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
}
