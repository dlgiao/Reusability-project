/**
 * Represents an athlete.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
class Athlete {
    /**
     * Create an athlete.
     *
     * @param {string} speciality - The speciality of the athlete.
     */
    constructor(speciality) {
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

module.exports = Athlete;