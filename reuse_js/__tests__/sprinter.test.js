const Sprinter = require("../src/sprinter");

describe("Sprinter", () => {
    let sprinter;

    beforeEach(() => {
        sprinter = new Sprinter("Usain", "Bolt", "sprinting");
    });

    // Test constructor
    describe("constructor", () => {
        it("should create an instance of Sprinter", () => {
            expect(sprinter).toBeInstanceOf(Sprinter);
        });

        it("should set firstName, lastName ans speciality correctly", () => {
            expect(sprinter.firstName).toBe("Usain");
            expect(sprinter.lastName).toBe("Bolt");
            expect(sprinter.speciality).toBe("sprinting");
        });
    });

    // Test display method
    it("should return correct information", () => {
        const consoleSpy = jest.spyOn(console, "log");
        sprinter.display();
        expect(consoleSpy).toHaveBeenCalledWith("My name is Usain Bolt. My speciality is sprinting.");
    });

    // Test inherited method
    it("should return correct string", () => {
        expect(sprinter.mySpeciality()).toBe("My speciality is sprinting.");
    });
});