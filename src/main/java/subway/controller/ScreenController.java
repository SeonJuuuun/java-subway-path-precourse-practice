package subway.controller;

import java.util.Scanner;
import subway.domain.Screen;

public class ScreenController {

    private final MainController mainController;
    private final PathController pathController;

    public ScreenController(MainController mainController, PathController pathController) {
        this.mainController = mainController;
        this.pathController = pathController;
    }

    public void run(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.MAIN)) {
            mainController.run(scanner);
        }
        if (screen.equals(Screen.PATH)) {
            pathController.run(scanner);
        }
    }
}
