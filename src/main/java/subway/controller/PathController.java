package subway.controller;

import java.util.Scanner;
import subway.domain.PathFunction;
import subway.domain.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class PathController {

    private PathController() {
    }

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.MAIN);
        callFunction(InputView.getInputFunctionCode(scanner, Screen.PATH), scanner);
    }

    private static void callFunction(String functionCode, Scanner scanner) {
        if (functionCode.equals(PathFunction.SHORTEST_PATH)) {
            ShortestPathController.run(scanner);
        }
        if (functionCode.equals(PathFunction.MINIMUM_TIME)) {
            MinimumTimePathController.run(scanner);
        }
        if (functionCode.equals(PathFunction.BACK)) {
            ScreenController.run(Screen.MAIN, scanner);
        }
    }

}
