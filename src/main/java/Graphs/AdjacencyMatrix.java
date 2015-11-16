package Graphs;

public class AdjacencyMatrix {
	private boolean[][] matrix;
	private int vertexCount;

	public AdjacencyMatrix(int vertexCount) {
		this.vertexCount = vertexCount;
		matrix = new boolean[vertexCount][vertexCount];
	}

	public void addEdge(int i, int j) {
		if (isValidCoord(i, j)) {
			matrix[i][j] = true;
			matrix[j][i] = true;
		}
	}

	public void removeEdge(int i, int j) {
		if (isValidCoord(i, j)) {
			matrix[i][j] = false;
			matrix[j][i] = false;
		}
	}

	public boolean isEdge(int i, int j) {
		if (isValidCoord(i, j)) return matrix[i][j];
		else
			return false;
	}
	
	private boolean isValidCoord(int i, int j){
		if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) return true;
		return false;
	}

	public String toString() {
		String result = "";

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				result += " " + matrix[i][j];
			}
			result += "\n";
		}
		return result;
	}
}
