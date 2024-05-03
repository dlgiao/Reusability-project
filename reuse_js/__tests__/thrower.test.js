const {Thrower} = require("../src/thrower");

// Mock Athlete
const MockAthlete = jest.fn().mockImplementation((speciality) => {
    return {
        mySpeciality: jest.fn().mockReturnValue(`My speciality is ${speciality}`)
    }
})

describe("Thrower", () => {
    const mockAthlete = new MockAthlete("shot put");
    const thrower = new Thrower("Ryan", "Crouser", mockAthlete);

    // Test constructor
    test("constructor should set the firstName, lastName and athlete correctly", () => {
        expect(thrower.firstName).toBe("Ryan");
        expect(thrower.lastName).toBe("Crouser");
        expect(thrower.athlete).toBe(mockAthlete);
    });
})