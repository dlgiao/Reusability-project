package com.kmmania;

/**
 * The DistanceRunner class implements the {@link AthleteInterface} by composition and represents an athlete specializing in distance running.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @see AthleteInterface
 * @see AthleteImpl
 */
public class DistanceRunner {
    private final String firstName;
    private final String lastName;
    private final AthleteInterface athlete;

    /**
     * Constructs a DistanceRunner object with the specified first name, last name, and specialty.
     *
     * @param firstName  the first name of the distance runner
     * @param lastName   the last name of the distance runner
     * @param speciality the specialty of the distance runner
     */
    public DistanceRunner(String firstName, String lastName, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = new AthleteImpl(speciality);
    }

    /**
     * Displays the distance runner's information including name and specialty.
     */
    public void display() {
        System.out.printf("My name is %s %s. %s\n", firstName, lastName, athlete);
    }
}
