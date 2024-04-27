package com.kmmania

/**
 * A sample client class demonstrating different implementations of athletes.
 */
fun main() {
    // Creating a sprinter instance
    val usain = Sprinter(
        "Usain",
        "Bolt",
        "sprinting"
    )
    usain.display()

    // Creating a thrower instance
    val ryan = Thrower(
        "Ryan",
        "Crouser",
        Athlete("shot put")
    )
    ryan.display()

    // Creating a distance runner instance
    val eliud = DistanceRunner(
        "Eliud",
        "Kipchoge",
        AthleteImpl("marathon")
    )
    eliud.display()

    // Creating a jumper instance
    val marco = Jumper(
        "Marco",
        "Tamberi",
        AthleteImpl("high jump")
    )
    marco.display()
}