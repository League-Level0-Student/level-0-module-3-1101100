package _07_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {
	
public static void main(String[] args) {
	
	String year = JOptionPane.showInputDialog("what year were you born");
	int yeer = Integer.parseInt(year);
	for (int i = 0; yeer <= 2019; yeer++) {
		
		JOptionPane.showMessageDialog(null, yeer);
	}
}
}
