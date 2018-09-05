package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer= JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equalsIgnoreCase("A Stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			JOptionPane.showMessageDialog(null, "Your current score is" +score);
			
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is a stamp");
		}

		// 6. Add some more riddles
		String response= JOptionPane.showInputDialog("What has an eye but cannot see?");
		if(response.equalsIgnoreCase("A Needle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is a needle");
		}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your current score is" +score);
		
	}
}

