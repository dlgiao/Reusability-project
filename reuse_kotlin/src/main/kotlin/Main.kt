package com.kmmania

fun main() {
    val usain = Sprinter("Usain", "Bolt", "sprinting")
    usain.display()

    val ryan = Thrower("Ryan", "Crouser", Athlete("shot put"))
    ryan.display()

    val Eliud = DistanceRunner("Eliud", "Kipchoge", AthleteImpl("marathoner"))
    Eliud.display()
}