/*
 * Classes reusability project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Classes reusability in Kotlin.
 * Thrower.kt
 */
package com.kmmania

/**
 * Class representing a thrower, utilizing composition with the Athlete class.
 *
 * @property firstName The first name of the thrower.
 * @property lastName The last name of the thrower.
 * @property athlete An instance of the Athlete class representing the thrower's specialization.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
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