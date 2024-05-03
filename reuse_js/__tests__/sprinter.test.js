const Sprinter = require("../src/sprinter");

describe("Sprinter", () => {
    const sprinter = new Sprinter("Usain", "Bolt", "sprinting");

    // Test constructor
    test("constructor should set firstName, lastName ans speciality correctly", () => {
        expect(sprinter.firstName).toBe("Usain");
        expect(sprinter.lastName).toBe("Bolt");
        expect(sprinter.speciality).toBe("sprinting");
    });

    // Test display method
    test("display() should return correct information", () => {
        const consoleSpy = jest.spyOn(console, "log");
        sprinter.display();
        expect(consoleSpy).toHaveBeenCalledWith("My name is Usain Bolt. My speciality is sprinting.");
    });

    // Test inherited method
    test("mySpeciality() should return correct string", () => {
        expect(sprinter.mySpeciality()).toBe("My speciality is sprinting.");
    });
});