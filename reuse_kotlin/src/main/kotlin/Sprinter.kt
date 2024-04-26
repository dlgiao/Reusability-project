package com.kmmania

class Sprinter(
    private val firstName: String,
    private val lastName: String,
    speciality: String
) : Athlete(speciality) {
    fun display() {
        println("My name is $firstName $lastName. ${super.mySpeciality()}")
    }
}