from unittest import mock

from src.distance_runner import DistanceRunner


class TestDistanceRunner:

    @mock.patch("src.athlete_base.AthleteBase")
    def setup_method(self, method, mock_athlete):
        print(f"Setting up {method}")
        mock_athlete.my_speciality.return_value = "My speciality is marathon."
        self.distance_runner = DistanceRunner("Eliud", "Kipchoge", mock_athlete)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.distance_runner

    def test_display_method(self, capsys):
        self.distance_runner.display()
        captured = capsys.readouterr()
        assert captured.out == "My name is Eliud Kipchoge. My speciality is marathon.\n"
