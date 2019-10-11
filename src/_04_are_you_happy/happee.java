package _04_are_you_happy;

import javax.swing.JOptionPane;

public class happee {
	public static void main(String[] args) {
		int userMood = JOptionPane.showOptionDialog(null,"Å̷̗̓͆͛̈́́͘̚͠ŗ̷̱̗͎͙̙͈̅̓͗̅͌̈́̈́̏͂͆e̶͖̘̮͔̳̖̘̙͋̏͐͌̀͒̀͊͘ ̴̛̪́́̎͛͊̅y̶̛͓̤̳̳͙̼̦̦͑̇͒̽͌͂͝ơ̶͚̼̫̖͈̒̌̿́̈́̅͝ű̴̢̥̗͙̼̩́̆̿̀̃̈ ̶̧̛̗̞̗̒̉͝͠ḩ̴̲̬̦̖͂̎̽ͅą̴̢̳͍̳̟̟̍̈́͆p̶̲͕̯͔̈́̋̀̿̇͑ṗ̸̗̩͈̦̟̰y̴̡̻̝̞̱̚", "01010100000001010111", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "yes", "no"}, null);
		//yes = 0
		//no = 1
		if (userMood == 0) {
			JOptionPane.showMessageDialog(null, "keep doing what you are doing");
		}
		else if (userMood == 1) {
			int um2 = JOptionPane.showOptionDialog(null, "do you want to be happy", "2", 0, 
					JOptionPane.INFORMATION_MESSAGE, null, new String[] {"yes", "no"}, null );
			if (um2 == 0) {
				JOptionPane.showMessageDialog(null, "change something");
				}
			else if (um2 == 1) {
				JOptionPane.showMessageDialog(null, "keep doing what you are doing");
				}
			}
		System.exit(0);
		}
	}

