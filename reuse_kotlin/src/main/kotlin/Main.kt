package com.kmmania

fun main() {
    val usain = Sprinter("Usain", "Bolt", "sprinting")
    usain.display()

    val ryan = Thrower("Ryan", "Crouser", Athlete("shot put"))
    ryan.display()

    val eliud = DistanceRunner("Eliud", "Kipchoge", AthleteImpl("marathon"))
    eliud.display()

    val marco = Jumper("Marco", "Tamberi", AthleteImpl("high jump"))
    marco.display()
}