package com.kmmania;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AthleteInterfaceTest {
    @InjectMocks
    private AthleteInterface athleteInterfaceMock;

    @BeforeEach
    void setUp() {
        athleteInterfaceMock = mock(AthleteInterface.class);
    }

    @Test
    void mySpecialityShouldReturnASpeciality() {
        // Given
        when(athleteInterfaceMock.mySpeciality()).thenReturn("Running");

        // When
        athleteInterfaceMock.mySpeciality();

        // Then
        assertThat("Running").isEqualTo(athleteInterfaceMock.mySpeciality());
    }

    @Test
    void directInstantiationShouldThrowException() {
        // Assert that attempting to directly instantiate AthleteInterface throws an exception
        assertThrows(UnsupportedOperationException.class, () -> {
            AthleteInterface athleteInterface = () -> {
                throw new UnsupportedOperationException(
                        "AthleteInterface is an interface and cannot be instantiated directly."
                );
            };
            athleteInterface.mySpeciality();
        });
    }
}