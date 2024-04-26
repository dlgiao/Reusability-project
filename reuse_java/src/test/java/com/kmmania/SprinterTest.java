package com.kmmania;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class SprinterTest {

    @Test
    void display_DisplaysCorrectInformation() {
        // Given
        String firstName = "John";
        String lastName = "Doe";
        String speciality = "Sprinting";
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
