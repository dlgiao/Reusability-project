/**
 * Class representing a distance runner utilizing composition with the AthleteInterface.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
class DistanceRunner {
    /**
     * Create a distance runner athlete.
     *
     * @param {string} firstName - The first name of the distance runner.
     * @param {string} lastName - The last name of the distance runner.
     * @param {AthleteBase} athlete - An instance of the AthleteBase representing the distance runner.
     */
    constructor(firstName, lastName, athlete) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.athlete = athlete;
    }

    /**
     * Display distance runner's information including name and speciality.
     */
    display() {
        console.log(`My name is ${this.firstName} ${this.lastName}. ${this.athlete.mySpeciality()}`);
    }
}

module.exports.DistanceRunner = DistanceRunner;