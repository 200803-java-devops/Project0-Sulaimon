package com;

import java.util.Arrays;

public class whowins {
    static String[] position = new String[9];
    static String turn = "X";

    String whoWins() {
		for (int i = 0; i < 8; i++) {
			String line = null;
			switch (i) {
			case 0:
				line = position[1] + position[2] + position[3];
				break;
			case 1:
                line = position[4] + position[5] + position[6];
				break;
			case 2:
                line = position[7] + position[8] + position[9];
				break;
			case 3:
				line = position[1] + position[4] + position[7];
				break;
			case 4:
				line = position[2] + position[5] + position[8];
				break;
			case 5:
				line = position[3] + position[6] + position[9];
				break;
			case 6:
				line = position[1] + position[5] + position[9];
				break;
			case 7:
                line = position[3] + position[5] + position[7];
                break;
            default:
                System.out.println("No winner");
            }
            
			if (line.equals("XXX")) {
				return "X wins";
			} else if (line.equals("OOO")) {
				return "O wins";
			    }
        }
        
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(position).contains(String.valueOf(i + 1))) {
				break;
			}
			else if (i == 8) return "draw";
        }
        
        System.out.println(turn + " ready " + turn );
        return null;
        
	}
}