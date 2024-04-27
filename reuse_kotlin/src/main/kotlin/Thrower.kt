package com.kmmania

/**
 * Class representing a thrower, utilizing composition with the Athlete class.
 *
 * @property firstName The first name of the thrower.
 * @property lastName The last name of the thrower.
 * @property athlete An instance of the Athlete class representing the thrower's specialization.
 */
class Thrower(
    val firstName: String,
    val lastName: String,
    private val athlete: Athlete
) {
    /**
     * Displays the information of the thrower including their name and speciality.
     */
    fun display() {
        println("My name is $firstName $lastName, ${athlete.mySpeciality()}")
    }
}