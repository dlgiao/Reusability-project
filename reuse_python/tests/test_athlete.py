from src.athlete import Athlete


class TestAthlete:

    def setup_method(self, method):
        self.athlete = Athlete("running")

    def teardown_method(self, method):
        del self.athlete

    def test_my_speciality_method(self):
        assert self.athlete.my_speciality() == "My speciality is running."
