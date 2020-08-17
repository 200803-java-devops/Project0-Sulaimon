package com.model;


import java.util.Scanner;
import java.io.*;

/**
 * Main class
 */
public class App {

    static Scanner input;
    static Scanner sc;
    static Scanner read;

    public static void main(String[] args) throws IOException {

        System.out.println('\n' + "Game begins with player X" + '\n');
        System.out.println("Player X enter your name in the format \"Tag_Number,Name. Note: First Quotation mark is included.");
        sc = new Scanner(System.in);
        String commandX = sc.nextLine();
        String[] cmdtokensX = commandX.split(",");
        Item playerX = new Item(ItemUtil.extractNumberFromInput(cmdtokensX[0]), cmdtokensX[1]);
        System.out.println("## 01: " + playerX.toString());
        ItemRepository dao = new ItemRepository();
        dao.insert(playerX);

        System.out.println("Player O enter your name in the format \"Tag_Number,Name. Note: First Quotation mark is included. ");
        sc = new Scanner(System.in);
        String commandO = sc.nextLine();
        String[] cmdtokensO = commandO.split(",");
        Item playerO = new Item(ItemUtil.extractNumberFromInput(cmdtokensO[0]), cmdtokensO[1]);
        System.out.println("## 02: " + playerO.toString());
        //ItemRepository dao = new ItemRepository();
        dao.insert(playerO);

        DBConnect db = new DBConnect();
        db.DBC();
        
        TicTacToe game = new TicTacToe();

        input = new Scanner(System.in);
        
        String turn = "X";
        String winner = null;


        game.updateBoard();
        game.makeBoard();
        System.out.println("Player X kindly start the game by picking a number");
       
        while (winner == null) {
            int num = input.nextInt();
            if ( num < 1 || num > 9 ) {
                System.out.println("Invalid input is given. It should be between 0 and 9");
                continue;
            }

            game.position[num-1] = ( String.valueOf(num) );  // This line is use to force the condition below to work

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