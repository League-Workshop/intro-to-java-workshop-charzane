package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot Licky=new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
Licky.setSpeed(100);
Licky.changeRobot("https://simg.nicepng.com/png/small/438-4383655_its-all-ogre-now-freetoedit-shrek-ogre-head.png");
		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	Licky.penDown();
	Licky.setPenColor(Color.red);
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
Licky.turn(90);
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0;i<360;i++) {
Licky.turn(360);
Licky.move(1);
		}	
		Licky.turn(180);
		
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}

}



