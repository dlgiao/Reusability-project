const Athlete = require( "./athlete" );

/**
 * Represents a sprinter.
 *
 * @extends Athlete
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
class Sprinter extends Athlete {
    /**
     * Create a sprinter.
     *
     * @param {string} firstName - The first name of the sprinter.
     * @param {string} lastName - The last name of the sprinter.
     * @param {string} speciality - The speciality of the sprinter.
     */
    constructor(firstName, lastName, speciality) {
        super(speciality);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Display sprinter's information including name and speciality.
     */
    display() {
        console.log(`My name is ${this.firstName} ${this.lastName}. ${super.mySpeciality()}`);
    }
}

module.exports = Sprinter;