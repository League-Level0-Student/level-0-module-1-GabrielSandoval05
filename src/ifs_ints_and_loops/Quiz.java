package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[]args) {
		int score=0;
		String response= JOptionPane.showInputDialog("What is the capital of California?");
		if(response.equals("Sacramento")) {
			JOptionPane.showMessageDialog(null, "You're correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorect oof");
			
		}
		JOptionPane.showMessageDialog(null, "Your current score is "+score);
		String answer= JOptionPane.showInputDialog("Who is the prime minister of the UK?");
		if(answer.equalsIgnoreCase("David Cameron")) {
			JOptionPane.showMessageDialog(null, "You are right!");
			score++;
		}
		else {
JOptionPane.showMessageDialog(null, "Better Luck next time");
}
		JOptionPane.showMessageDialog(null, "Your current score is " +score);
}
}