const {DistanceRunner} = require("../src/distance_runner");

// Mock Athlete
const MockAthlete = jest.fn().mockImplementation((speciality) => {
    return {
        mySpeciality: jest.fn().mockReturnValue(`My speciality is ${speciality}`)
    }
});

describe("Distance Runner", () => {
    let mockAthlete;
    let distanceRunner;

    beforeEach(() => {
        mockAthlete = new MockAthlete("marathon");
        distanceRunner = new DistanceRunner("Eliud", "Kipchoge", mockAthlete);
    });

    // Test constructor
    describe("constructor", () => {
        it("should create an instance of DistanceRunner", () => {
            expect(distanceRunner).toBeInstanceOf(DistanceRunner);
        })

        it("should set the firstName, lastName and athlete correctly", () => {
            expect(distanceRunner.firstName).toBe("Eliud");
            expect(distanceRunner.lastName).toBe("Kipchoge");
            expect(distanceRunner.athlete).toBe(mockAthlete);
        });
    });

    // Test display method
    it("should return correct information", () => {
        const consoleSpy = jest.spyOn(console, "log");
        distanceRunner.display();
        expect(consoleSpy).toHaveBeenCalledWith("My name is Eliud Kipchoge. My speciality is marathon");
    });
})