package subway.domain;

import java.util.List;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class PathTimes {

    private final WeightedMultigraph<Station, DefaultWeightedEdge> pathTime =
        new WeightedMultigraph<>(DefaultWeightedEdge.class);

    public PathTimes(List<Station> stations, List<Integer> times) {
        addStation(stations);
        addStationDistance(stations, times);
    }

    private void addStation(List<Station> stations) {
        for (Station station : stations) {
            pathTime.addVertex(station);
        }
    }

    private void addStationDistance(List<Station> stations, List<Integer> times) {
        for (int i = 0; i < stations.size() - 1; i++) {
            pathTime.setEdgeWeight(
                pathTime.addEdge(stations.get(i), stations.get(i + 1)),
                times.get(i)
            );
        }
    }

    public WeightedMultigraph<Station, DefaultWeightedEdge> getPathDistance() {
        return pathTime;
    }

}
