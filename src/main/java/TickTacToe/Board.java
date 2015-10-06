package TickTacToe;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import TickTacToe.Game.Player;

public class Board {
	Player[][] grid;
	
	Board(){
		grid = new Player[3][3];
	}
	
	public Player get(int row, int col){
		return this.grid[row][col];
	}
	
	public void set(Player player, int row, int col){
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
	
	// returns player that has won or null
	public Player gameOver(){
		
		// check the rows
		HashMap<Player, Integer> rowScores = new HashMap<Player, Integer>();
		
		for(int i = 0; i<grid.length; i++){
			Player winner = checkScores(rowScores);
			if(winner != null) return winner; 
		}
		return null;
	}
	
	private Player checkRow(int row){
		int result = 0;
		for(int j = 0; j<grid[row].length; j++){
			if(grid[row][j] == Player.X) result++;
			else if(grid[row][j] == Player.O) result--;
		}
		if(result == 3) return Player.X;
		else if(result == -3) return Player.O;
		return null;
	}
	
	private Player checkCol(int col){
		int result = 0;
		for(int j = 0; j<grid.length; j++){
			if(grid[j][col] == Player.X) result++;
			else if(grid[j][col] == Player.O) result--;
		}
		if(result == 3) return Player.X;
		else if(result == -3) return Player.O;
		return null;
	}
	
	private Player checkDiag(int col){
		int result = 0;
				if(grid[0][0] == Player.X) result++;
				else if(grid[0][0] == Player.O) result--;
		
		if(result == 3) return Player.X;
		else if(result == -3) return Player.O;
		return null;
	}
	
	public Player checkScores(HashMap<Player, Integer> scores){
		if(scores.get(Player.X) == 3) return Player.X;
		else if(scores.get(Player.O) == 3) return Player.O;
		return null;
	}
}