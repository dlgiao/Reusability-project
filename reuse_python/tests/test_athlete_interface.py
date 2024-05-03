from unittest import mock


class TestAthleteInterface:

    @mock.patch("src.athlete_interface.AthleteInterface")
    def setup_method(self, method, mock_athlete_interface):
        print(f"Setting up {method}")
        mock_athlete_interface.my_speciality.return_value = "My speciality is running."
        self.athlete_interface = mock_athlete_interface

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.athlete_interface

    def test_my_speciality_method(self):
        assert self.athlete_interface.my_speciality() == "My speciality is running."
