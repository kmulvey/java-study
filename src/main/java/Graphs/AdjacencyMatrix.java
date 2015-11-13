package Graphs;

public class AdjacencyMatrix {
	private boolean[][] matrix;
	private int vertexCount;

	public AdjacencyMatrix(int vertexCount) {
		this.vertexCount = vertexCount;
		matrix = new boolean[vertexCount][vertexCount];
	}

	public void addEdge(int i, int j) {
		if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
			matrix[i][j] = true;
			matrix[j][i] = true;
		}
	}

	public void removeEdge(int i, int j) {
		if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
			matrix[i][j] = false;
			matrix[j][i] = false;
		}
	}

	public boolean isEdge(int i, int j) {
		if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) return matrix[i][j] = false;
		else
			return false;

	}
}
