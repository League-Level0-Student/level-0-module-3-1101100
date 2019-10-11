package _05_horoscope;

import java.net.URI;

import javax.swing.JOptionPane;

public class hscope {
	public static void main(String[] args) {
		int hs = JOptionPane.showOptionDialog(null, "what is your sign", "why", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, 
				new String[] {"aries", "taurus", "gemini", "cancer", "leo", "virgo", "libra", "scorpio", "sagittarius", "capricorn", 
						"aquarius", "pisces", "idk what my horoscope is"}, null);
		System.out.println(hs);
		if (hs == 0) {
			JOptionPane.showMessageDialog(null, "[aries horoscope]");
		}	
		else if (hs == 1) {
			JOptionPane.showMessageDialog(null, "[taurus horoscope]");
		}
		else if (hs == 2) {
			JOptionPane.showMessageDialog(null, "[gemini horoscope]");
		}
		else if (hs == 3) {
			JOptionPane.showMessageDialog(null, "[cancer horoscope]");
		}
		else if (hs == 4) {
			JOptionPane.showMessageDialog(null, "[leo horoscope]");
		}
		else if (hs == 5) {
			JOptionPane.showMessageDialog(null, "[virgo horoscope]");
		}
		else if (hs == 6) {
			JOptionPane.showMessageDialog(null, "[libra horoscope]");
		}
		else if (hs == 7) {
			JOptionPane.showMessageDialog(null, "[scorpio horoscope]");
		}
		else if (hs == 8) {
			JOptionPane.showMessageDialog(null, "[sagittarius horoscope]");
		}
		else if (hs == 9) {
			JOptionPane.showMessageDialog(null, "[capricorn horoscope]");
		}
		else if (hs == 10) {
			JOptionPane.showMessageDialog(null, "[aquarius horoscope]");
		}
		else if (hs == 11) {
			JOptionPane.showMessageDialog(null, "[pices horoscope]");
		}
		else if (hs == 12) {
			JOptionPane.showMessageDialog(null, "look it up and then come back");
		}
		



	}		
}
