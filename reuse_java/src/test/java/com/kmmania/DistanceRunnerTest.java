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
        AthleteInterface athleteSpy = spy(new AthleteImpl(speciality)); // Utilisation de spy au lieu de mock
        DistanceRunner distanceRunner = new DistanceRunner(firstName, lastName, speciality);
        distanceRunner.setAthlete(athleteSpy);

        // When
        distanceRunner.display();

        // Then
        assertThat(distanceRunner.getFirstName()).isEqualTo(firstName);
        assertThat(distanceRunner.getLastName()).isEqualTo(lastName);
        verify(athleteSpy).mySpeciality(); // Vérification de l'appel à mySpeciality() sur l'objet espion
    }
}
