package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class JumperTest {
    @Test
    @DisplayName("display() method should display correct information")
    void displayShouldDisplaysCorrectInformation() {
        // Given
        String firstName = "Marco";
        String lastName = "Tamberi";
        String speciality = "high jump";
        AthleteInterface athleteMock = mock(AthleteInterface.class);
        when(athleteMock.mySpeciality()).thenReturn("My speciality is " + speciality + ".");
        Jumper jumper = new Jumper(firstName, lastName, athleteMock);

        // When
        jumper.display();

        // Then
        assertThat(jumper.getFirstName()).isEqualTo(firstName);
        assertThat(jumper.getLastName()).isEqualTo(lastName);
        verify(athleteMock).mySpeciality();
    }
}