package athlete

import (
	"github.com/stretchr/testify/assert"
	"os"
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
	output := captureOutput(func() {
		sprinter.Display()
	})

	// Then
	expected := "My name is Usain Bolt. My speciality is sprinting.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)

	/*	if output != expected {
		t.Errorf("Expected output %s, but got %s", expected, output)
	}*/
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
	output := captureOutput(func() {
		thrower.Display()
	})

	// Then
	expected := "My name is Ryan Crouser. My speciality is shot put.\n"
	assert.Equal(t, expected, output, "Expected output %s, but got %s", expected, output)

	//if output != expected {
	//	t.Errorf("Expected output %s, but got %s", expected, output)
	//}
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
