package com.kmmania

/**
 * Class representing a jumper utilizing composition with the AthleteInterface.
 *
 * @property firstName The first name of the jumper.
 * @property lastName The last name of the jumper.
 * @property athlete An instance of the AthleteInterface representing the jumper.
 */
class Jumper(
    val firstName: String,
    val lastName: String,
    private val athlete: AthleteInterface
) {

    /**
     * Displays the information of the jumper including their name and speciality.
     */
    fun display() {
        println("My name is $firstName $lastName. ${athlete.mySpeciality()}")
    }
}