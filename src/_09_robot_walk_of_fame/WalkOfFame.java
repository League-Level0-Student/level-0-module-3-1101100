
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		int starSize = 30;
		rob.setSpeed(200);
		rob.miniaturize();
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setX(10);
		int x = 10;
		// You also need to show the robot to see the result of this line.
		
		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */
		

	}
	private void drawStar(int starSize) {
		rob.penDown();
		for (int i = 0; i < 5; i++) {
			rob.move(starSize);
	rob.turn(144);
	}
	}

}
