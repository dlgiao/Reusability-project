from src.sprinter import Sprinter


class TestSprinter:
    def setup_method(self):
        self.sprinter = Sprinter("Usain", "Bolt", "sprinting")

    def teardown_method(self):
        del self.sprinter

    def test_display_method(self, capsys):
        self.sprinter.display()
        captured = capsys.readouterr()
        assert captured.out == "My name is Usain Bolt, My speciality is sprinting.\n"
