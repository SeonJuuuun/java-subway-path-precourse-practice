package subway.controller;

import java.util.Scanner;
import subway.domain.Screen;

public class ScreenController {

    private ScreenController() {
    }

    public static void run(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.MAIN)) {
            MainController.run(scanner);
        }
        if (screen.equals(Screen.PATH)) {
            PathController.run(scanner);
        }
    }
}
