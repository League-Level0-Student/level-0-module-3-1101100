//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(
				"which color of the rainbow (roygbiv) would you like the robot to draw. Please spell correctly.");
		// 5. Use an if/else statement to set the pen color that the user requested
		int i = 0;
		while (i++ < 3) {
			if (color.equals("red")) {
				rob.setPenColor(100, 0, 0);
			} else if (color.equals("orange")) {
				rob.setPenColor(255, 183, 0);
			} else if (color.equals("yellow")) {
				rob.setPenColor(246, 255, 0);
			} else if (color.equals("green")) {
				rob.setPenColor(38, 255, 0);
			} else if (color.equals("blue")) {
				rob.setPenColor(0, 140, 255);
			} else if (color.equals("indigo")) {
				rob.setPenColor(18, 0, 117);
			} else if (color.equals("violet")) {
				rob.setPenColor(195, 0, 255);
			} else {
				rob.setRandomPenColor();
			}
		}
		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
		rob.setPenWidth(1);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		int flameSize = 200;
		int baseSize = 300;
		rob.penDown();
		rob.setSpeed(100);
		for (int i1 = 0; i1 < 25; i1++) {
			// 2. Turn the robot 1/8 of a circle
			rob.turn(45);
			// 3. Move the robot 64 pixels
			rob.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the
			// robot counter-clockwise.)
			rob.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			rob.move(flameSize);
			// 6. Turn the robot 170 degrees
			rob.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			rob.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			rob.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			rob.move(baseSize);
		}

	}
}
