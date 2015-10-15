package Graphs;

import java.util.List;
import java.util.Map;
import java.util.NavigableSet;

public class Graph {
	private final List<Vertex> vertexes;
	private final List<Edge> edges;

	public Graph(List<Vertex> vertexes, List<Edge> edges) {
		this.vertexes = vertexes;
		this.edges = edges;
	}

	public List<Vertex> getVertexes() {
		return vertexes;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	/* dijkstra's algorithm using a binary heap. */
	public void dijkstra(final NavigableSet<Vertex> q) {
		Vertex u, v;
		while (!q.isEmpty()) {
			u = q.pollFirst();
			if (u.getDist() == Integer.MAX_VALUE)
				break;

			for (Map.Entry<Vertex, Integer> a : u.getNeighbors().entrySet()) {
				v = a.getKey();
				final int alternateDist = u.getDist() + a.getValue();
				if (alternateDist < v.getDist()) {
					q.remove(v);
					v.setDist(alternateDist);
					v.setPrevious(u);
					q.add(v);
				}
			}
		}
	}
}
