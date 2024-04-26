package com.kmmania

class AthleteImpl(private val speciality: String) : AthleteInterface {
    override fun mySpeciality(): String = "My speciality is $speciality."
}