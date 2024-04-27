/*
 * Classes reusability project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Classes reusability in Kotlin.
 * AthleteImpl.kt
 */
package com.kmmania

/**
 * Implementation of the AthleteInterface representing an athlete.
 *
 * @property speciality The specialty of the athlete.
 * @constructor Creates an AthleteImpl with the specified speciality.
 * @param speciality The specialty of the athlete.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 */
class AthleteImpl(private val speciality: String) : AthleteInterface {

    /**
     * Retrieves the speciality of the athlete.
     *
     * @return A string representing the speciality of the athlete.
     */
    override fun mySpeciality(): String = "My speciality is $speciality."
}