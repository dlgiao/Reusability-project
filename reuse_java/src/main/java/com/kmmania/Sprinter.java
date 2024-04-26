package com.kmmania;

/**
 * The Sprinter class extends the {@link Athlete} class and represents a sprinter athlete.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @see Athlete
 */
public class Sprinter extends Athlete {
    private final String firstName;
    private final String lastName;

    /**
     * Constructs a Sprinter object with the specified first name, last name, and specialty.
     *
     * @param firstName  the first name of the sprinter
     * @param lastName   the last name of the sprinter
     * @param speciality the specialty of the sprinter
     */
    public Sprinter(String firstName, String lastName, String speciality) {
        super(speciality);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Displays the sprinter's information including name and specialty.
     */
    public void display() {
        System.out.printf("My name is %s %s. %s\n", this.firstName, this.lastName, super.mySpeciality());
    }
}
