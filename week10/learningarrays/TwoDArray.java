package week10.learningarrays;

import java.util.Scanner;

public class TwoDArray {
	
	// Initialise a Two Dimensional Arrays
	// To represent a Tic Tac Toe Board
	static char[][] ticTacToeBoard = 
		{
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
	
	public static void main(String[] args) {
		// Another way to initialise a Two Dimensional Arrays
//		char[][] ticTacToeBoard2 = new char[3][3];
//		// ticTacToeBoard2[x][y]
//		ticTacToeBoard2[0][0] = ' ';
//		ticTacToeBoard2[0][1] = ' ';
//		ticTacToeBoard2[0][2] = ' ';
//		ticTacToeBoard2[1][0] = ' ';
//		ticTacToeBoard2[1][1] = ' ';
//		ticTacToeBoard2[1][2] = ' ';
//		ticTacToeBoard2[2][0] = ' ';
//		ticTacToeBoard2[2][1] = ' ';
//		ticTacToeBoard2[2][2] = ' ';
		
		Scanner userInput = new Scanner(System.in);
		
		String input = "";
		// A state to store the symbol of the current player
		char playerSymbol = 'O';
		// A state to store if a player wins or not yet
		// true to represent a player wins
		// false to represent no one wins yet and the game continue
		boolean playerWin = false;
		// A state to store which player turn to play
		boolean player1Turn = true;
		
		boolean draws = false;
		
		// The game will continue if no one wins yet
		while(playerWin == false && draws == false) {
			// Print the tic tac toe board
			printTicTacToeBoard();
			
			// Change the player symbol depending on whose turn.
			if(player1Turn == true) {
				playerSymbol = 'O';
			} else {
				playerSymbol = 'X';
			}
			// Print the player symbol to tell whose turn is it.
			System.out.println("Player " + playerSymbol + " turn.");
			// Ask for xy coordinate input
			System.out.println("Please input xy coordinate:");
			input = userInput.nextLine();
			// Making sure if the user key in two values only.
			// Since we need xy coordinates only, the user should
			// input 01 (for x=0 and y=1) or 20 (for x=2 and y=0)
			// If it is more than two values, example 101, it should
			// be an invalid input.
			if(input.length() == 2) {
				// Convert input String by the user to char array
				char[] inputArray = input.toCharArray();
				// Each character in Java can be represented to
				// numeric value.
				int x = Character.getNumericValue(inputArray[0]);
				int y = Character.getNumericValue(inputArray[1]);
				
				// Check if the xy coordinate keyed in by the player
				// is within the range of the board.
				if(x >= 0 && x < ticTacToeBoard.length &&
						y >= 0 && y < ticTacToeBoard[x].length) {
					// Check if the xy location of the board is already
					// filled in with a player symbol already or not.
					// If it is a space, that means the player can 
					// 
					if(ticTacToeBoard[x][y] == ' ') {
						// Fill in the board with the current player symbol.
						ticTacToeBoard[x][y] = playerSymbol;
						
						// Check if a player wins
						// Check for all rows if 3 same symbol
						for(int rows = 0; rows < 3; rows++) {
							if(ticTacToeBoard[rows][0] == playerSymbol &&
									ticTacToeBoard[rows][1] == playerSymbol &&
									ticTacToeBoard[rows][2] == playerSymbol) {
								playerWin = true;
								break;
							}
						}
						// Check for all columns if 3 same symbol
						if(playerWin == false) {
							for(int columns = 0; columns < 3; columns++) {
								if(ticTacToeBoard[0][columns] == playerSymbol &&
										ticTacToeBoard[1][columns] == playerSymbol &&
										ticTacToeBoard[2][columns] == playerSymbol) {
									playerWin = true;
									break;
								}
							}
						}
						// Check for diagonals if 3 same symbol
						if(playerWin == false) {
							if(ticTacToeBoard[0][0] == playerSymbol &&
									ticTacToeBoard[1][1] == playerSymbol &&
									ticTacToeBoard[2][2] == playerSymbol) {
								playerWin = true;
							} else {
								if(ticTacToeBoard[2][0] == playerSymbol &&
										ticTacToeBoard[1][1] == playerSymbol &&
										ticTacToeBoard[0][2] == playerSymbol) {
									playerWin = true;
								}
							}
						}
						
						if(playerWin == false) {
							
							// Check for draws
							boolean containEmptySpace = false;
							for(int rows = 0; rows < 3; rows++) {
								for(int columns = 0; columns < 3; columns++) {
									if(ticTacToeBoard[rows][columns] == ' ') {
										containEmptySpace = true;
										break;
									}
								}
								if(containEmptySpace == true) {
									break;
								}
							}
							if(containEmptySpace == false) {
								draws = true;
								printTicTacToeBoard();
								System.out.println("Its a draw.");
							} else {
								// Swap turns after playing.
								if(player1Turn == true) {
									player1Turn = false;
								} else {
									player1Turn = true;
								}
							}
							
						} else {
							printTicTacToeBoard();
							System.out.println("Player " + playerSymbol + " wins.");
						}
						
						
					} else {
						System.out.println("This coordinate is already used.");
					}
				} else {
					System.out.println("Invalid coordinate");
				}
				
			} else {
				System.out.println("Invalid Input");
			}
		}
		
		
	}
	
	public static void printTicTacToeBoard() {
		System.out.println("\\ y   0    1    2");
		System.out.println("x   ===============");
		for(byte x = 0; x < ticTacToeBoard.length; x++) {
			System.out.print(x + "   ");
			for(byte y = 0; y < ticTacToeBoard[x].length; y++) {
				System.out.print("| " + ticTacToeBoard[x][y] + " |");
			}
			System.out.println();
			System.out.println("    ===============");
		}
	}
	
}









