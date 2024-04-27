package com.kmmania;

/**
 * The Jumper class implements the {@link AthleteInterface} by composition and represents an athlete
 * specializing in jumping.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @see AthleteInterface
 * @see AthleteImpl
 */
public class Jumper {
    private final String firstName;
    private final String lastName;
    private final AthleteInterface athlete;

    /**
     * Constructs a Jumper object with the specified first name, last name, and specialty.
     *
     * @param firstName the first name of the jumper
     * @param lastName  the last name of the jumper
     * @param athlete   An instance of the {@link AthleteInterface} representing the distance runner.
     */
    public Jumper(String firstName, String lastName, AthleteInterface athlete) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = athlete;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Displays the jumper's information including name and specialty.
     */
    public void display() {
        System.out.printf("My name is %s %s. %s\n",
                this.firstName,
                this.lastName,
                this.athlete.mySpeciality()
        );
    }
}
