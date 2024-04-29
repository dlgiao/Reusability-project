package athlete_interface

import "testing"

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
