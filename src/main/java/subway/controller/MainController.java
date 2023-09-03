package subway.controller;

import java.util.Scanner;
import subway.domain.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class MainController {

    public void run(Scanner scanner) {
        OutputView.loadView(Screen.MAIN);
        InputView.getInputFunctionCode(scanner, Screen.MAIN);
    }
}
