package Matrices;

import java.util.Arrays;

public class Matrix {
	private int[][] grid;

	public Matrix(int[][] input) {
		this.grid = input;
	}

	public Matrix(int width, int height) {
		grid = new int[height][width];
		for (int i = 0; i < height; i++) {
			Arrays.fill(grid[i], i);
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < grid.length; i++) {
			for (int h = 0; h < grid.length; h++) {
				result.append(Integer.toString(grid[i][h]));
			}
			result.append("\n");

		}
		return result.toString();
	}

	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		this.grid = grid;
	}

	public void rotate() {
		for (int layer = 0; layer < grid.length / 2; ++layer) {
			int first = layer;
			int last = grid.length - 1 - layer;

			for (int i = first; i < last; ++i) {
				int offset = i - first;
				// save top
				int top = grid[first][i];
				// left -> top
				grid[first][i] = grid[last - offset][first];
				// bottom -> left
				grid[last - offset][first] = grid[last][last - offset];
				// right -> bottom
				grid[last][last - offset] = grid[i][last];
				// top -> right
				grid[i][last] = top;
			}
		}
	}

	public void square() {
		int[][] result = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				for (int k = 0; k < grid.length; k++)
					result[i][j] += grid[i][k] * grid[k][j];
		grid = result;
	}
}
