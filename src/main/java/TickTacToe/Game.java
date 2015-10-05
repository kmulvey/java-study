package TickTacToe;

public class Game {

	Board board;
	
	Game(){
		board = new Board();
	}
	
	public void makeMove(String player, int row, int col){
		if(board.get(row, col) == null){
			board.set(player, row, col);
		}
	}
	
	public boolean isOver(){
		
		
		return false;
	}
	
	public void print(){
		System.out.println(board.toString());

	}
}
