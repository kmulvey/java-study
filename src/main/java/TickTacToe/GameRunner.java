package TickTacToe;

import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Game g = new Game();

		while (true) {
			System.out.print("Player: ");
			String player = userInput.next();
			
			System.out.print("Move: ");
			String move = userInput.next();
			if (move.equals("quit")) {
				g.print();
				System.exit(0);
			}
			String[] coords = move.split(",");
			g.makeMove(player, Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
			g.print();
		}
	}
}
