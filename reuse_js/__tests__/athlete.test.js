const Athlete = require('../src/athlete');

describe('Athlete', () => {
    // Test constructor
    test("constructor should set the speciality correctly", () => {
        const athlete = new Athlete("running");
        expect(athlete.speciality).toBe("running");
    });

    // Test mySpeciality method
    test("mySpeciality() should return correct string", () => {
        const athlete = new Athlete("running");
        expect(athlete.mySpeciality()).toBe("My speciality is running.");
    });
});