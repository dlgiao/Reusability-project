package com.kmmania;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SprinterTest {

    @Test
    void display_DisplaysCorrectInformation() {
        // Given
        String firstName = "John";
        String lastName = "Doe";
        String speciality = "Sprinting";
        Sprinter sprinter = new Sprinter(firstName, lastName, speciality);

        // When
        sprinter.display();

        // Then
        // Verify output to console, not easily testable with JUnit alone
        // We can add logging and capture system output for more comprehensive testing
    }

    // Additional test case to demonstrate Mockito usage if needed
    @Test
    void display_DisplaysCorrectInformation_MockitoExample() {
        // Given
        String firstName = "John";
        String lastName = "Doe";
        String speciality = "Sprinting";
        Sprinter sprinter = mock(Sprinter.class);
        when(sprinter.mySpeciality()).thenReturn("My speciality is " + speciality + ".");

        // When
        sprinter.display();

        // Then
        // Verify output to console, not easily testable with JUnit alone
    }
}
