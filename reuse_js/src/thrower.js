/**
 * Represents a thrower athlete using composition.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
class Thrower {
    /**
     * Create a thrower athlete.
     *
     * @param {string} firstName - The first name of the thrower.
     * @param {string} lastName - The last name of the thrower.
     * @param {Athlete} athlete - The speciality of the thrower.
     */
    constructor(
        firstName,
        lastName,
        athlete
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = athlete;
    }

    /**
     * Display thrower's information including name and speciality.
     */
    display() {
        console.log(`My name is ${this.firstName} ${this.lastName}. ${this.athlete.mySpeciality()}.`);
    }
}

module.exports.Thrower = Thrower;