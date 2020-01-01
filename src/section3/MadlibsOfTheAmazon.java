package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "if you have to drown yourself in nacho cheese, here is how to not die.");
		// Get the user to enter an adjective
		String name=JOptionPane.showInputDialog(null,"ENTER ADJECTIVE(or your family will die as of this moment)");
		// Get the user to enter a type of liquid
		String name2=JOptionPane.showInputDialog(null,"ENTER SOMETHING OF THE SAME STATE OF MATTER AS NACHO CHEEEEEEZ(or your family will die as of this moment)");
		// Get the user to enter a body part
		String name3=JOptionPane.showInputDialog(null,"ENTER APPENDAGE ON UR BODY(or your family will die as of this moment)");
		// Get the user to enter a verb
		String name4=JOptionPane.showInputDialog(null,"ENTER FUN THING 2 DO(or your family will die as of this moment)");
		// Get the user to enter a place
		String name5=JOptionPane.showInputDialog(null,"ENTER THE LOCATION OPF YOUR BIRTH(or your family will die as of this moment)");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Demon bananaz are more "+name+" during the day, so cross the NACHO CHEEEEEEEEEEEEEEEEEEZ at night. Demon Bananaz are attracted to fresh, squishy "+name2+  " and will most likely devour you soul and eat the leftover "+name3+"if you "+name4+ ". Whatever you do, if you have an open wound, try to find a nuclear weapon to end your life, because they are zombie demon Bananaz. Or you could go to "+name5+  ". Good luck!.");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

