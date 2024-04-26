package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class SprinterTest {

    @Test
    @DisplayName("display() method should display correct information")
    void displayShouldDisplayCorrectInformation() {
        // Given
        String firstName = "Usain";
        String lastName = "Bolt";
        String speciality = "sprinting";
        Sprinter sprinter = new Sprinter(firstName, lastName, speciality);

        // Stub the mySpeciality method directly on the sprinter object
        Sprinter spySprinter = spy(sprinter);
        doReturn("My speciality is " + speciality + ".").when(spySprinter).mySpeciality();

        // When
        spySprinter.display();

        // Then
        assertThat(spySprinter.getFirstName()).isEqualTo(firstName);
        assertThat(spySprinter.getLastName()).isEqualTo(lastName);
        verify(spySprinter).mySpeciality(); // Verify that mySpeciality method is invoked
    }
}
