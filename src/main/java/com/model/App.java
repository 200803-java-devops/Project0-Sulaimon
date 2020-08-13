package com.model;


import java.util.Scanner;
import java.io.*;

public class App {

    static Scanner input;
    static Scanner read;

    public static void main(String[] args) throws IOException {

        read = new Scanner(System.in);
        Register player = new Register();
        System.out.print("Enter your ID number: " + '\n');
        player.setid1(read.nextInt());
        System.out.print("Enter your Player X name: " + '\n');
        player.setName1(read.nextLine());
        System.out.print("Enter your ID number: " + '\n');
        player.setid2(read.nextInt());
        System.out.print("Enter your Player O name: " + '\n');
        player.setName2(read.nextLine());
        Register.print();
        //read.close();

        TicTacToe game = new TicTacToe();

        input = new Scanner(System.in);
        
        String turn = "X";
        String winner = null;

        System.out.println("Game begins ...");

        game.updateBoard();
        game.makeBoard();
            
       
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
			System.out.println( winner + " won.");
		} 

    }
}