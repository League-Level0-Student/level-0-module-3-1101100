package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class Roboot {
	
	Robot rob = new Robot();
	
	
	void pickSquare() {
		rob.setSpeed(100);
		rob.setPenWidth(5);
		for (int i = 0; i < 1; i++) {
		drawSquare();
		rob.setX(0);
		rob.setY(0);
		}
	}
	void pickTriangle() {
		rob.setSpeed(100);
		rob.setPenWidth(5);
		for (int i = 0; i < 1; i++) {
		drawTriangle();
		rob.setX(0);
		rob.setY(0);
		}
	}
	void pickCircle() {
		rob.setSpeed(100);
		rob.setPenWidth(5);
		for (int i = 0; i < 1; i++) {
		drawCircle();
		rob.setX(0);
		rob.setY(0);
		}
	}
	
	void drawSquare() {
		rob.penDown();
		rob.setSpeed(100);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
	}
	
	void drawTriangle() {
		rob.penDown();
		rob.setSpeed(100);
    	for (int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(120);
			
		}
	}
	
	
	void drawCircle() {
		
		rob.penDown();
		rob.setSpeed(75);
    	for (int i = 0; i < 100; i++) {
			rob.move(5);
			rob.turn(5);
    	}
	}
	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "pick a shape", "why", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, 
				new String[] {"square", "circle", "triangle"}, null);
		
		if (shape == 0) {
		new Roboot().pickSquare();
		}
		if (shape == 1) {
		new Roboot().pickCircle();
		}
		if (shape == 2) {
		new Roboot().pickTriangle();
		}
		
	}
	
}
