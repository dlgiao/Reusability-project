package com.kmmania;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AthleteImplTest {

    @Test
    void mySpeciality_ReturnsCorrectSpeciality() {
        // Given
        String speciality = "Running";
        AthleteImpl athlete = new AthleteImpl(speciality);

        // When
        String result = athlete.mySpeciality();

        // Then
        assertThat(result).isEqualTo("My speciality is Running.");
    }
}
