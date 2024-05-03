const {Thrower} = require("../src/thrower");

// Mock Athlete
const MockAthlete = jest.fn().mockImplementation((speciality) => {
    return {
        mySpeciality: jest.fn().mockReturnValue(`My speciality is ${speciality}`)
    }
});

describe("Thrower", () => {
    let mockAthlete;
    let thrower;

    beforeEach(() => {
        mockAthlete = new MockAthlete("shot put");
        thrower = new Thrower("Ryan", "Crouser", mockAthlete);
    });

    // Test constructor
    it("should set the firstName, lastName and athlete correctly", () => {
        expect(thrower.firstName).toBe("Ryan");
        expect(thrower.lastName).toBe("Crouser");
        expect(thrower.athlete).toBe(mockAthlete);
    });

    // Test display method
    it("should return correct information", () => {
        const consoleSpy = jest.spyOn(console, "log");
        thrower.display();
        expect(consoleSpy).toHaveBeenCalledWith("My name is Ryan Crouser. My speciality is shot put.");
    });

    // Test if athlete is an instance of Athlete
    // it("should be an instance of Athlete", () => {
    //     expect(thrower.athlete).toBeInstanceOf(MockAthlete);
    // });

    // Test if athlete has mySpeciality method
    it("should have mySpeciality method", () => {
        expect(typeof thrower.athlete.mySpeciality).toBe("function");
    });
})