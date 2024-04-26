package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AthleteImplTest {

    @Test
    @DisplayName("mySpeciality() method should return correct speciality")
    void mySpecialityShouldReturnCorrectSpeciality() {
        // Given
        String speciality = "Running";
        AthleteImpl athlete = new AthleteImpl(speciality);

        // When
        String result = athlete.mySpeciality();

        // Then
        assertThat(result).isEqualTo("My speciality is Running.");
    }
}
