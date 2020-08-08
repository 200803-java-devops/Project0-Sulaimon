package com;

import java.util.Scanner;

public class Test {

    static Scanner input;

    public static void main(String[] args) {
        String[] position = new String[9];
        String turn = "X";
        
        TicTacToe game = new TicTacToe();
        whowins who = new whowins();


        input = new Scanner(System.in);
        String winner = null;
        game.makeBoard();
        game.updateBoard();


        System.out.println("Game begins ...");
        game.makeBoard();

        while (winner == null) {
            int num = input.nextInt();
            if ( num < 1 || num > 9 ) {
                System.out.println("Invalid input is given. It should be between 0 and 9");
            }

            if (position[num].equals( String.valueOf(num) )) {
				position[num] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				game.makeBoard();
				winner = who.whoWins();
			} else {
				System.out.println("Try again");
				continue;
			}
        }

        if (winner.equalsIgnoreCase("draw")) {
			System.out.println("This is a draw!");
		} else {
			System.out.println( winner + " won.");
		} 

    }
}