package athlete

import (
	"github.com/stretchr/testify/assert"
	"kmmania.com/reuse_go/utils"
	"testing"
)

func TestAthlete_MySpeciality(t *testing.T) {
	// Given
	athlete := Athlete{Speciality: "running"}

	// When
	result := athlete.MySpeciality()

	// Then
	expected := "My speciality is running."
	assert.Equal(t, expected, result, "My speciality is running. Expected %s, got %s", expected, result)
}

func TestSprinter_Display(t *testing.T) {
	// Given
	sprinter := Sprinter{
		Firstname: "Usain",
		Lastname:  "Bolt",
		Athlete: Athlete{
			Speciality: "sprinting",
		},
	}

	// When
	output := utils.CaptureOutput(func() {
		sprinter.Display()
	})

	// Then
	expected := "My name is Usain Bolt. My speciality is sprinting.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
}

func TestThrower_Display(t *testing.T) {
	// Given
	thrower := Thrower{
		Firstname: "Ryan",
		Lastname:  "Crouser",
		Athlete: Athlete{
			Speciality: "shot put",
		},
	}

	// When
	output := utils.CaptureOutput(func() {
		thrower.Display()
	})

	// Then
	expected := "My name is Ryan Crouser. My speciality is shot put.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)
}
