package com.kmmania

class DistanceRunner(
    private val firstName: String,
    private val lastName: String,
    private val athlete: AthleteInterface
) {
    fun display() {
        println("My name is $firstName $lastName. ${athlete.mySpeciality()}")
    }
}