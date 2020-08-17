package com;

import java.util.Scanner;
import java.io.*;
import org.apache.commons.io.IOUtils;

import java.nio.charset.StandardCharsets;

public class App {

    static Scanner input;

    public static void main(String[] args) throws IOException {

        InputStreamReader cin = null;

        TicTacToe game = new TicTacToe();
        // whowins who = new whowins();

        input = new Scanner(System.in);
        
        //String[] position = new String[9];
        String turn = "X";
        String winner = null;
        String player1 = null;
        String player2 = null;
        String winningName;

        System.out.println("Game begins ...");
        // We are asking for the user's names, but we never use the values that we input. 
        try {
            cin = new InputStreamReader(System.in);
            Scanner in = new Scanner(System.in);
            System.out.println("Player X enter your name, then player O enter your name. Enter 'x' to start game.");
            player1 = in.next();
            player2 = in.next();
            char c;
            do {
                c = (char) cin.read();
            } while(c != 'x');

            game.updateBoard();
            game.makeBoard();
            
        } catch (IOException e) {
            System.out.println("Wrong kind of input");
        } 
        while (winner == null) {
            int num = input.nextInt();
            if ( num < 1 || num > 9 ) {
                System.out.println("Invalid input is given. It should be between 0 and 9");
                continue;
            }

            game.position[num-1] = ( String.valueOf(num) );  // This line is use to force the condition below to work
            /*
            System.out.println(num);
            System.out.println(String.valueOf(num));
            System.out.println(position[num-1]); 
            */

            if (game.position[num-1].equals( String.valueOf(num) )) {
				game.position[num-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				game.makeBoard();
				winner = game.whoWins();
			} else {
				System.out.println("Try again");
				continue;
			}
        }

        if (winner.equalsIgnoreCase("draw")) {
			System.out.println("This is a draw!");
		} else {
            System.out.println(winner);
            if(winner.toUpperCase().charAt(0) == 'X'){
            System.out.println( player1 + " won.");
            }else{
                System.out.println(player2 + " won.");
            }
		} 

    }
}