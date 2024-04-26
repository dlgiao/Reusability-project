package com.kmmania

class Thrower(
    val firstName: String,
    val lastName: String,
    speciality: String
) {
    private val athlete = Athlete(speciality)

    fun display() {
        println("My name is $firstName $lastName, ${athlete.mySpeciality()}")
    }
}