package com.kmmania;

/**
 * The Thrower class implements the {@link Athlete} class by composition and represents a thrower athlete.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @see Athlete
 */
public class Thrower {
    private final String firstName;
    private final String lastName;
    private final Athlete athlete;

    /**
     * Constructs a Thrower object with the specified first name, last name, and specialty.
     *
     * @param firstName  the first name of the thrower
     * @param lastName   the last name of the thrower
     * @param athlete    the athlete
     */
    public Thrower(String firstName, String lastName, Athlete athlete) {
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
     * Displays the thrower's information including name and specialty.
     */
    public void display() {
        System.out.printf("My name is %s %s. %s\n", firstName, lastName, athlete.mySpeciality());
    }
}
