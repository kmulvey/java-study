package TickTacToe;

public class Board {
	String[][] grid;
	
	Board(){
		grid = new String[3][3];
	}
	
	public String get(int row, int col){
		return this.grid[row][col];
	}
	
	public void set(String player, int row, int col){
		this.grid[row][col] = player;
	}
	
	public String toString(){
		String result = "";
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[i].length; j++){
				if(grid[i][j] == null) result += " ";
				else result += grid[i][j];
			}
			result += "\n";
		}
		return result;
	}
}
