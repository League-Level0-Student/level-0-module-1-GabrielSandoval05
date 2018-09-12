package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class favoriteColor {
	public static void main(String[] args) {
		int score=0;
	String input=	JOptionPane.showInputDialog("What is your favorite color?");
	if(input.equalsIgnoreCase("green")) {
		JOptionPane.showMessageDialog(null, "Green is awesome!");
		score++;
		
	}
	else {
	JOptionPane.showMessageDialog(null, "Your favorite color is " +input);
}
	}
}
