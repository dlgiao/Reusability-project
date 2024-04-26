package com.kmmania

class Sprinter(
    val firstName: String,
    val lastName: String,
    speciality: String
) : Athlete(speciality) {
    fun display() {
        println("My name is $firstName $lastName. ${super.mySpeciality()}")
    }
}