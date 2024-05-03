from unittest import mock
from unittest.mock import MagicMock

import pytest

from src.thrower import Thrower


class TestThrower:

    @mock.patch('src.athlete.Athlete')
    def setup_method(self, method, mock_athlete):
        # athlete = MagicMock()
        # athlete.my_speciality.return_value = "shot put"
        mock_athlete.my_speciality.return_value = "My speciality is shot put."
        self.thrower = Thrower("Ryan", "Crouser", mock_athlete)

    def teardown_method(self, method):
        del self.thrower

    def test_display_method(self, capsys):
        self.thrower.display()
        captured = capsys.readouterr()
        assert captured.out == "My name is Ryan Crouser. My speciality is shot put.\n"
