package subway.view;

import java.util.List;
import subway.domain.Screen;

public class OutputView {

    private static final String START_MESSAGE = "## ";
    private static final String INFO_MESSAGE = "[INFO] ";
    private static final String ERROR_MESSAGE = "[ERROR] ";

    public static void printMessage() {
        System.out.println(START_MESSAGE + "원하는 기능을 선택하세요.");
    }

    public static void loadView(Screen screen) {
        printEnter();
        printTitle(screen.getTitle());
        printFunctionList(screen.getFunctions());
        printEnter();
    }

    private static void printTitle(String title) {
        System.out.println(START_MESSAGE + title);
    }

    private static void printFunctionList(List<String> functionList) {
        for (String function : functionList) {
            System.out.println(function);
        }
    }

    private static void printEnter() {
        System.out.println();
    }
}
