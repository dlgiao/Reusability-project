package com.kmmania

/**
 * Base class representing an athlete.
 *
 * @property speciality The specialty of the athlete.
 */
open class Athlete(private val speciality: String) {
    /**
     * Retrieves the speciality of the athlete.
     *
     * @return A string representing the speciality of the athlete.
     */
    fun mySpeciality(): String = "My speciality is $speciality."
}