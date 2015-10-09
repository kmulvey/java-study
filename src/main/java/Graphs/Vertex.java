package Graphs;

import java.util.HashMap;

public class Vertex {
	private final String id;
	private final String name;
	private final HashMap<Vertex, Integer> neighbors = new HashMap<Vertex, Integer>();
	private int dist = Integer.MAX_VALUE;
	private Vertex previous = null;

	public Vertex(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

	public HashMap<Vertex, Integer> getNeighbors() {
		return neighbors;
	}

	public Vertex getPrevious() {
		return previous;
	}

	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		return prime + ((id == null) ? 0 : id.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Vertex other = (Vertex) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return name;
	}
}