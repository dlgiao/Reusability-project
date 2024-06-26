/**
 * Class representing a jumper utilizing composition with the AthleteInterface.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
class Jumper {
    /**
     * Create a jumper athlete.
     *
     * @param {string} firstName - The first name of the jumper.
     * @param {string} lastName - The last name of the jumper.
     * @param {AthleteBase} athlete - An instance of the AthleteBase representing the jumper.
     */
    constructor(firstName, lastName, athlete) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = athlete;
    }

    /**
     * Display jumper's information including name and speciality.
     */
    display() {
        console.log(`My name is ${this.firstName} ${this.lastName}. ${this.athlete.mySpeciality()}`);
    }
}

module.exports.Jumper = Jumper;