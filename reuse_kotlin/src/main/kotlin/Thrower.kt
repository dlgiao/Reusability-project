package com.kmmania

class Thrower(
    private val firstName: String,
    private val lastName: String,
    speciality: String
) {
    private val athlete = Athlete(speciality)

    fun display() {
        println("My name is $firstName $lastName, ${athlete.mySpeciality()}")
    }
}