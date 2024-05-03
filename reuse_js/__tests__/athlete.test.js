const Athlete = require('../src/athlete');

describe('Athlete', () => {
    let athlete;

    beforeEach(() => {
        athlete = new Athlete("running");
    });

    // Test constructor
    test("constructor should set the speciality correctly", () => {
        expect(athlete.speciality).toBe("running");
    });

    // Test mySpeciality method
    test("mySpeciality() should return correct string", () => {
        expect(athlete.mySpeciality()).toBe("My speciality is running.");
    });
});