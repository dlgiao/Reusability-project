package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(result).isEqualTo(String.format("My speciality is %s.", speciality));
    }
}
