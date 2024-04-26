package com.kmmania;

/**
 * The AthleteImpl class implements the {@link AthleteInterface} and represents an athlete.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @see AthleteInterface
 */
public class AthleteImpl implements AthleteInterface {
    private final String speciality;

    /**
     * Constructs an AthleteImpl object with the specified specialty.
     *
     * @param speciality the specialty of the athlete
     */
    public AthleteImpl(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Returns a string representation of the athlete's specialty.
     *
     * @return a string representing the athlete's specialty
     */
    @Override
    public String mySpeciality() {
        return "My speciality is " + this.speciality + ".";
    }
}
