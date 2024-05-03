from unittest import mock

from src.thrower import Thrower


class TestThrower:

    @mock.patch('src.athlete.Athlete')
    def setup_method(self, method, mock_athlete):
        print(f"Setting up {method}")
        mock_athlete.my_speciality.return_value = "My speciality is shot put."
        self.thrower = Thrower("Ryan", "Crouser", mock_athlete)

    def teardown_method(self, method):
        print(f"Tearing down {method}")
        del self.thrower

    def test_display_method(self, capsys):
        self.thrower.display()
        captured = capsys.readouterr()
        assert captured.out == "My name is Ryan Crouser. My speciality is shot put.\n"
