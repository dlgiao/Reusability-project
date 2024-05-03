from src.athlete_base import AthleteBase


class TestAthleteBase:

    def setup_method(self, method):
        print(f"Setting up {method}")
        self.athlete_base = AthleteBase("running")

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.athlete_base

    def test_my_speciality_method(self):
        assert self.athlete_base.my_speciality() == "My speciality is running."
