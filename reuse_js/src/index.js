/**
 * @file Main file for athlete project implementation.
 * @author Dac Linh Giao NGUYEN
 * @version 0.1
 * @since 0.1
 */
const Sprinter = require("./sprinter")
const Athlete = require("./athlete")
const {Thrower} = require("./thrower");

/**
 * Create instances of different types of athletes and display their information.
 *
 * @function
 */
function main() {
    // Creating a Sprinter instance
    const usain = new Sprinter("Usain", "Bolt", "sprinting");
    // Displaying information about the Sprinter
    usain.display();

    // Creating a Thrower instance
    const ryan = new Thrower("Ryan", "Crouser", new Athlete("shot put"));
    // Displaying information about the Thrower
    ryan.display();
}

// Call the main function to execute the program
main();