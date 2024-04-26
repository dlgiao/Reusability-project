package com.kmmania

class DistanceRunner(
    val firstName: String,
    val lastName: String,
    private val athlete: AthleteInterface
) {
    fun display() {
        println("My name is $firstName $lastName. ${athlete.mySpeciality()}")
    }
}