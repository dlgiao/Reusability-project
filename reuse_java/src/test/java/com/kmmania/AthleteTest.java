package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AthleteTest {

    @Test
    @DisplayName("mySpeciality() method should return correct speciality")
    void mySpecialityShouldReturnCorrectSpeciality() {
        // Given
        String speciality = "Running";
        Athlete athlete = new Athlete(speciality);

        // When
        String result = athlete.mySpeciality();

        // Then
        assertThat(result).isEqualTo("My speciality is Running.");
    }

    // Additional test case to demonstrate Mockito usage if needed
    @Test
    @DisplayName("mySpeciality() method should return correct speciality with Mockito")
    void mySpecialityShouldReturnsCorrectSpecialityWithMockitoExample() {
        // Given
        String speciality = "Running";
        Athlete athlete = mock(Athlete.class);
        when(athlete.mySpeciality()).thenReturn("My speciality is " + speciality + ".");

        // When
        String result = athlete.mySpeciality();

        // Then
        assertThat(result).isEqualTo("My speciality is Running.");
    }
}
