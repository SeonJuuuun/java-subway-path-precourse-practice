package subway.domain;

import java.util.List;

public class Path {

    private final Line line;
    private final List<Station> station;
    private final PathDistances pathDistances;
    private final PathTimes pathTimes;

    public Path(Line line, List<Station> station, List<Integer> pathDistances,
        List<Integer> pathTimes) {
        this.line = line;
        this.station = station;
        this.pathDistances = new PathDistances(station, pathDistances);
        this.pathTimes = new PathTimes(station, pathTimes);
    }

    public PathDistances getPathDistances() {
        return pathDistances;
    }

    public PathTimes getPathTimes() {
        return pathTimes;
    }
}
