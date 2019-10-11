
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int hbd = JOptionPane.showOptionDialog(null, "what birthday do you want to know", "REEEEEEEEEEEEEEE", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, 
				new String[] {"mom", "dad", "mine"}, null);
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if (hbd == 0) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		if (hbd == 1) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		if (hbd == 2) {
			JOptionPane.showMessageDialog(null, myBirthday);
			JOptionPane.showMessageDialog(null, "how did you even forget, thats like, "
					+ "the one date that everyone seems to never forget about is theri birthday, and yet, you still manage to forget. "
					+ "Like, it doesn't make any sense. That's day you are BORN");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		System.exit(0);
	} 
}
