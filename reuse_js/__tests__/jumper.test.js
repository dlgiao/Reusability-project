const {Jumper} = require("../src/jumper");

// Mock Athlete
const MockAthlete = jest.fn().mockImplementation((speciality) => {
    return {
        mySpeciality: jest.fn().mockReturnValue(`My speciality is ${speciality}.`)
    }
});

describe("Jumper", () => {
    let mockAthlete;
    let jumper;

    beforeEach(() => {
        mockAthlete = new MockAthlete("high jump");
        jumper = new Jumper("Marco", "Tamberi", mockAthlete);
    });

    // Test constructor
    describe("constructor", () => {
        it("should create an instance of Jumper", () => {
            expect(jumper).toBeInstanceOf(Jumper);
        });

        it("should set the firstName, lastName and athlete correctly", () => {
            expect(jumper.firstName).toBe("Marco");
            expect(jumper.lastName).toBe("Tamberi");
            expect(jumper.athlete).toBe(mockAthlete);
        });
    });

    // Test display method
    it("should return correct information", () => {
        const consoleSpy = jest.spyOn(console, "log");
        jumper.display();
        expect(consoleSpy).toHaveBeenCalledWith("My name is Marco Tamberi. My speciality is high jump.");
    });
});