package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
     String name=JOptionPane.showInputDialog(null,"What is ur name");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "your name is "+name+ "?");
		String name1=JOptionPane.showInputDialog(null,"What is ur name");
		// 3. Ask the user for the name of their best friend
		JOptionPane.showMessageDialog(null, "are you sure?");
		String name3=JOptionPane.showInputDialog(null,"What is ur name");
		JOptionPane.showMessageDialog(null, "ok fine."+name3);
		String name2=JOptionPane.showInputDialog(null,"do you have any friends?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "no you don't");
	} 
}



