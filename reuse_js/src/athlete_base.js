/**
 * Represents an implementation of AthleteInterface.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
const AthleteInterface = require("./athlete_interface");

class AthleteBase extends AthleteInterface {
    /**
     * Create an Athlete implementation.
     *
     * @param {string} speciality - The speciality of the athlete.
     */
    constructor(speciality) {
        super();
        this.speciality = speciality;
    }

    /**
     * Get the speciality of the athlete.
     *
     * @returns {string} The speciality of the athlete.
     */
    mySpeciality() {
        return `My speciality is ${this.speciality}.`;
    }
}