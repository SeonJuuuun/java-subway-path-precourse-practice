package subway.controller;

import java.util.Scanner;
import subway.domain.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class MainController {

    private static final String QUIT = "Q";

    private MainController() {
    }

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.MAIN);
        shiftFunctionScreen(InputView.getInputFunctionCode(scanner, Screen.MAIN), scanner);
    }

    private static void shiftFunctionScreen(String functionIndex, Scanner scanner) {
        if (functionIndex.equals(Screen.PATH.getIndex())) {
            ScreenController.run(Screen.PATH, scanner);
        }
        if (functionIndex.equals(QUIT)) {
            quitProgram(scanner);
        }
    }

    private static void quitProgram(Scanner scanner) {
        scanner.close();
        System.exit(0);
    }
}
