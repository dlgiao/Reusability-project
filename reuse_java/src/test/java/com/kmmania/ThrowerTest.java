package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ThrowerTest {

    @Test
    @DisplayName("display() method should display correct information")
    void displayShouldDisplayCorrectInformation() {
        // Given
        String firstName = "Alice";
        String lastName = "Smith";
        String speciality = "Throwing";
        Athlete mockAthlete = mock(Athlete.class);
        when(mockAthlete.mySpeciality()).thenReturn("My speciality is " + speciality + ".");
        Thrower thrower = new Thrower(firstName, lastName, speciality);
        thrower.setAthlete(mockAthlete);

        // When
        thrower.display();

        // Then
        assertThat(thrower.getFirstName()).isEqualTo(firstName);
        assertThat(thrower.getLastName()).isEqualTo(lastName);
        verify(mockAthlete).mySpeciality();
    }
}
