package com.kmmania;

/**
 * The Main class demonstrates the usage of various athlete classes.
 *
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 */
public class Main {

    /**
     * The main method instantiates objects of different athlete types and displays their information.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        Sprinter usain = new Sprinter("Usain", "Bolt", "sprinting");
        usain.display();

        Thrower ryan = new Thrower("Ryan", "Crouser", "shot put");
        ryan.display();

        DistanceRunner eliud = new DistanceRunner("Eliud", "Kipchoge", "marathoner");
        eliud.display();

        Jumper marco = new Jumper("Marco", "Tamberi", "high jump");
        marco.display();
    }
}