from unittest import mock

from src.jumper import Jumper


class TestJumper:

    @mock.patch("src.athlete_base.AthleteBase")
    def setup_method(self, method, mock_athlete):
        print(f"Setting up {method}")
        mock_athlete.my_speciality.return_value = "My speciality is high jump."
        self.jumper = Jumper("Marco", "Tamberi", mock_athlete)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.jumper

    def test_display_method(self, capsys):
        self.jumper.display()
        captured = capsys.readouterr()
        assert captured.out == "My name is Marco Tamberi. My speciality is high jump.\n"
