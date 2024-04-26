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
        String firstName = "Ryan";
        String lastName = "Crouser";
        String speciality = "shot put";
        Athlete athleteMock = mock(Athlete.class);
        when(athleteMock.mySpeciality()).thenReturn("My speciality is " + speciality + ".");
        Thrower thrower = new Thrower(firstName, lastName, athleteMock);

        // When
        thrower.display();

        // Then
        assertThat(thrower.getFirstName()).isEqualTo(firstName);
        assertThat(thrower.getLastName()).isEqualTo(lastName);
        verify(athleteMock).mySpeciality();
    }
}
