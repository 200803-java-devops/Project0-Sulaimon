package com;

public class UserInput {
	public InputStreamReader cin;
	
	public UserInput() {
		cin = null;
	}
	
	public char askForInput() throws IOException {
		cin = new InputStreamReader(System.in);
		return cin.readline();
	}
}