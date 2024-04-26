package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DistanceRunnerTest {

    @Test
    @DisplayName("display() method should display correct information")
    void displayShouldDisplaysCorrectInformation() {
        // Given
        String firstName = "Eliud";
        String lastName = "Kipchoge";
        String speciality = "marathon";
        AthleteInterface athleteMock = mock(AthleteInterface.class);
        when(athleteMock.mySpeciality()).thenReturn("My speciality is " + speciality + ".");
        DistanceRunner distanceRunner = new DistanceRunner(firstName, lastName, speciality);
        distanceRunner.setAthlete(athleteMock);

        // When
        distanceRunner.display();

        // Then
        assertThat(distanceRunner.getFirstName()).isEqualTo(firstName);
        assertThat(distanceRunner.getLastName()).isEqualTo(lastName);
        // verify(athleteMock).mySpeciality();
    }
}
