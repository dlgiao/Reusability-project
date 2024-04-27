/*
 * Classes reusability project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Classes reusability in Kotlin.
 * Jumper.kt
 */
package com.kmmania

/**
 * Class representing a jumper utilizing composition with the AthleteInterface.
 *
 * @property firstName The first name of the jumper.
 * @property lastName The last name of the jumper.
 * @property athlete An instance of the AthleteInterface representing the jumper.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
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