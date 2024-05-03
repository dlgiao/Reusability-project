const Athlete = require('../src/athlete');

describe('Athlete', () => {
    let athlete;

    beforeEach(() => {
        athlete = new Athlete("running");
    });

    // Test constructor
    it("should set the speciality correctly", () => {
        expect(athlete.speciality).toBe("running");
    });

    // Test mySpeciality method
    it("should return correct string", () => {
        expect(athlete.mySpeciality()).toBe("My speciality is running.");
    });
});