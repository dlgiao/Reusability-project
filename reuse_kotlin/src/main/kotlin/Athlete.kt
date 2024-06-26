/*
 * Classes reusability project.
 * Dac Linh Giao NGUYEN
 * License MIT
 *
 * Classes reusability in Kotlin.
 * Athlete.kt
 */
package com.kmmania

/**
 * Base class representing an athlete.
 *
 * @property speciality The specialty of the athlete.
 * @constructor Creates an Athlete with the specified specialty.
 * @param speciality The specialty of the athlete.
 * @author Dac Linh Giao NGUYEN
 * @since 0.1
 */
open class Athlete(private val speciality: String) {

    /**
     * Retrieves the speciality of the athlete.
     *
     * @return A string representing the speciality of the athlete.
     */
    fun mySpeciality(): String = "My speciality is $speciality."
}