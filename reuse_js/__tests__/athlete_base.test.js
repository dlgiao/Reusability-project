const {AthleteBase} = require("../src/athlete_base")

describe("AthleteBase", () => {
    let athleteBase;

    beforeEach(() => {
        athleteBase = new AthleteBase("running");
    });

    describe("constructor", () => {
        it("should create an instance of AthleteBase", () => {
            expect(athleteBase).toBeInstanceOf(AthleteBase);
        });
        it("should set the speciality correctly", () => {
            const speciality = athleteBase.speciality;
            expect(speciality).toBe("running");
        });
    });

    describe("mySpeciality", () => {
        it("should return the correct speciality", () => {
            const result = athleteBase.mySpeciality();
            expect(result).toBe("My speciality is running.");
        });
    });
});