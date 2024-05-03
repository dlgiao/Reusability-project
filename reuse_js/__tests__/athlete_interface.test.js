describe("AthleteInterface", () => {
    describe("mySpeciality", () => {
        it("should be implemented by subclasses", () => {
            // mock for mySpeciality() method
            const mySpecialityMock = jest.fn(() => "running");

            // Athlete mock with mySpeciality() method
            const athleteMock = {
                mySpeciality: mySpecialityMock
            };

            // mySpeciality of Athlete mock method call
            const result = athleteMock.mySpeciality();

            expect(result).toBe("running");
            expect(mySpecialityMock).toHaveBeenCalledTimes(1);
        });
    });
});