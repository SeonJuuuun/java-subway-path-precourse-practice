package subway.domain;

import java.util.Arrays;
import java.util.List;

public enum Screen {

    MAIN("B", "메인 화면", Arrays.asList("1. 경로 조회", "Q. 종료")),
    PATH("1", "경로 기준", Arrays.asList("1. 최단 거리", "2. 최소 시간", "B. 돌아가기"));

    private final String index;
    private final String title;
    private final List<String> functions;

    Screen(String index, String title, List<String> functions) {
        this.index = index;
        this.title = title;
        this.functions = functions;
    }

    public String getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getFunctions() {
        return functions;
    }
}
