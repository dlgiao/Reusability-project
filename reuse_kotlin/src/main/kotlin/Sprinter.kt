package com.kmmania

/**
 * Class representing a sprinter, inheriting from the Athlete class.
 *
 * @property firstName The first name of the sprinter.
 * @property lastName The last name of the sprinter.
 * @property speciality The speciality of the sprinter, inherited from the Athlete class.
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