package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot A=new Robot();
		// 5. Set your robot's pen down 
	A.penDown();
		// 3. Set the robot to go at max speed (100)
		A.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int i=0; i<1000000000;i++ ) {
			// 7. Change the pen color to random
A.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			A.move(1*i);
			// 2. Turn the robot 360/7 degrees to the right
		A.turn(360/8);
			// 8. Set the pen width to i
			A.setPenWidth(i);
	A.changeRobot("https://res.cloudinary.com/teepublic/image/private/s--01bLAJ3B--/t_Resized%20Artwork/c_fit,g_north_west,h_1054,w_1054/co_ffffff,e_outline:53/co_ffffff,e_outline:inner_fill:53/co_bbbbbb,e_outline:3:1000/c_mpad,g_center,h_1260,w_1260/b_rgb:eeeeee/c_limit,f_jpg,h_630,q_90,w_630/v1570601487/production/designs/6259998_0.jpg");
		}
	}}
