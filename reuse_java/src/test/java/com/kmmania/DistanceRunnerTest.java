package com.kmmania;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DistanceRunnerTest {

    @Test
    void display_DisplaysCorrectInformation() {
        // Given
        String firstName = "Alice";
        String lastName = "Smith";
        String speciality = "Distance";
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
