package com.kmmania;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class JumperTest {
    @Test
    void display_DisplaysCorrectInformation() {
        // Given
        String firstName = "Alice";
        String lastName = "Smith";
        String speciality = "Distance";
        AthleteInterface athleteMock = mock(AthleteInterface.class);
        when(athleteMock.mySpeciality()).thenReturn("My speciality is " + speciality + ".");
        Jumper jumper = new Jumper(firstName, lastName, speciality);
        jumper.setAthlete(athleteMock);

        // When
        jumper.display();

        // Then
        assertThat(jumper.getFirstName()).isEqualTo(firstName);
        assertThat(jumper.getLastName()).isEqualTo(lastName);
        // verify(athleteMock).mySpeciality();
    }
}