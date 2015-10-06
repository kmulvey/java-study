package TickTacToe;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
	enum Player {
		X, O
	};

	Board board;
	Player currPlayer;

	Game() {
		board = new Board();
		currPlayer = Player.X;
	}

	public void makeMove(int row, int col) {
		if (board.get(row, col) == null) {
			board.set(currPlayer, row, col);
		}
		if(currPlayer == Player.X) currPlayer = Player.O;
		else currPlayer = Player.X;
	}

	public void play() {
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.print("Player "+ currPlayer + " Move: ");
			String move = userInput.next();
			if (move.equals("quit")) {
				this.print();
				System.exit(0);
			}
			String[] coords = move.split(",");
			this.makeMove(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
			this.print();

			Player winner = board.gameOver();
			if(winner != null) {
				System.out.println("Winner is: " + winner);
				System.exit(0);
			}
		}
	}

	public void print() {
		System.out.println(board.toString());

	}
}
