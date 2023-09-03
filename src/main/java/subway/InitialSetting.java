package subway;

import java.util.List;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Path;
import subway.domain.PathRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class InitialSetting {

    private static final int ADD_COUNT = 3;

    private InitialSetting() {
    }

    private static final List<String> STATIONS = List.of(
        "교대역", "강남역", "역삼역", "남부터미널역", "양재역", "양재시민의숲역", "매봉역");
    private static final List<String> LINES = List.of("2호선", "3호선", "신분당선");
    private static final List<List<String>> PATH = List.of(
        List.of("교대역", "강남역", "역삼역"),
        List.of("교대역", "남부터미널역", "양재역", "매봉역"),
        List.of("강남역", "양재역", "양재시민의숲역"));
    private static final List<List<Integer>> PATH_DISTANCES = List.of(
        List.of(2, 2),
        List.of(3, 6, 1),
        List.of(2, 10));
    private static final List<List<Integer>> PATH_TIMES = List.of(
        List.of(3, 3),
        List.of(2, 5, 1),
        List.of(8, 3));

    public static void setting() {
        settingLines();
        settingStations();
        settingPath();
    }

    private static void settingLines() {
        for (String lineName : LINES) {
            Line line = new Line(lineName);
            LineRepository.addLine(line);
        }
    }

    private static void settingStations() {
        for (String stationName : STATIONS) {
            Station station = new Station(stationName);
            StationRepository.addStation(station);
        }
    }

    private static void settingPath() {
        for (int i = 0; i < ADD_COUNT; i++) {
            Path path = new Path(
                LineRepository.selectLineByName(LINES.get(i)),
                StationRepository.selectStationsByNames(PATH.get(i)),
                PATH_DISTANCES.get(i),
                PATH_TIMES.get(i)
            );
            PathRepository.addPath(path);
        }
    }
}


