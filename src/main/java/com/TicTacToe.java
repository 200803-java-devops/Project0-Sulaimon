package com;

public class TicTacToe {
    
    static String[] position = new String[9];
    static String turn = "X";
    
	public void makeBoard() {
		System.out.println( "\n\n" );
        System.out.println(  "\n\n" );
        System.out.println(  "\n\n\t\t" + position[1] + "   | " + position[2] + "  |     " + position[3]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + position[4] + "   | " + position [5] + "  | "     + position [6]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t ___|____|___ " );
        System.out.println(  "\n\n\t\t" + position[7] + "   | " + position[8] + "  | "     + position[9]);
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  " \t\t    |    |   " );
        System.out.println(  "\n\n" );
    }

    public void updateBoard() {
            for (int i = 0; i < 9; i++) {
                position[i] = String.valueOf(i+1);
            }
    }
    
            
}

