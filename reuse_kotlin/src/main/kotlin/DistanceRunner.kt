/*
 * Classes reusability project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Classes reusability in Kotlin.
 * DistanceRunner.kt
 */
package com.kmmania

/**
 * Class representing a distance runner utilizing composition with the AthleteInterface.
 *
 * @property firstName The first name of the distance runner.
 * @property lastName The last name of the distance runner.
 * @property athlete An instance of the AthleteInterface representing the distance runner.
 * @constructor Creates a DistanceRunner with the specified first name, last name, and athlete instance.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 */
class DistanceRunner(
    val firstName: String,
    val lastName: String,
    private val athlete: AthleteInterface
) {

    /**
     * Displays the information of the distance runner including their name and speciality.
     */
    fun display() {
        println("My name is $firstName $lastName. ${athlete.mySpeciality()}")
    }
}