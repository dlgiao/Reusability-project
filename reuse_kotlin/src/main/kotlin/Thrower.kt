package com.kmmania

class Thrower(
    val firstName: String,
    val lastName: String,
    private val athlete: Athlete
) {
    fun display() {
        println("My name is $firstName $lastName, ${athlete.mySpeciality()}")
    }
}