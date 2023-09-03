package subway;

import java.util.Scanner;
import subway.controller.MainController;
import subway.controller.PathController;
import subway.controller.ScreenController;
import subway.domain.Screen;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        InitialSetting.setting();
        ScreenController screenController = new ScreenController(new MainController(), new PathController());
        screenController.run(Screen.MAIN, scanner);
    }
}
