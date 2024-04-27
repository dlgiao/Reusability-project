/*
 * Classes reusability project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Classes reusability in Kotlin.
 * Sprinter.kt
 */
package com.kmmania

/**
 * Class representing a sprinter, inheriting from the [Athlete] class.
 *
 * @property firstName The first name of the sprinter.
 * @property lastName The last name of the sprinter.
 * @property speciality The speciality of the sprinter, inherited from the [Athlete] class.
 * @constructor Creates a Sprinter with the specified first name, last name, and speciality.
 * @param firstName The first name of the sprinter.
 * @param lastName The last name of the sprinter.
 * @param speciality The speciality of the sprinter.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 * @see Athlete
 */
class Sprinter(
    val firstName: String,
    val lastName: String,
    speciality: String
) : Athlete(speciality) {
    /**
     * Displays the information of the sprinter including their name and speciality.
     */
    fun display() {
        println("My name is $firstName $lastName. ${super.mySpeciality()}")
    }
}