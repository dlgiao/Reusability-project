package com.kmmania;

/**
 * The Athlete class defines a profile for an athlete.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class Athlete {
    private final String speciality;

    /**
     * Constructs an Athlete object with the specified specialty.
     *
     * @param speciality the specialty of the athlete
     */
    public Athlete(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Returns a string representation of the athlete's specialty.
     *
     * @return a string representing the athlete's specialty
     */
    public String mySpeciality() {
        return "My speciality is " + this.speciality + ".";
    }
}
