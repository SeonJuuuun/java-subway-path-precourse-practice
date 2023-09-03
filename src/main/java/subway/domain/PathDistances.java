package subway.domain;

import java.util.List;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class PathDistances {

    private final WeightedMultigraph<Station, DefaultWeightedEdge> pathDistance =
        new WeightedMultigraph<>(DefaultWeightedEdge.class);

    public PathDistances(List<Station> stations, List<Integer> distances) {
        addStation(stations);
        addStationDistance(stations, distances);
    }

    private void addStation(List<Station> stations) {
        for (Station station : stations) {
            pathDistance.addVertex(station);
        }
    }

    private void addStationDistance(List<Station> stations, List<Integer> distances) {
        for (int i = 0; i < stations.size() - 1; i++) {
            pathDistance.setEdgeWeight(
                pathDistance.addEdge(stations.get(i), stations.get(i + 1)),
                distances.get(i)
            );
        }
    }
}
