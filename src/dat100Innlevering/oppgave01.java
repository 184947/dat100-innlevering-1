package dat100Innlevering;
import javax.swing.JOptionPane;
import java.lang.Integer.*;

public class oppgave01 {

	public static void main(String[] args) { 
		
		for(int i = 0; i < 10; i++) {
		
		String input = JOptionPane.showInputDialog("Whats your test result?: " ); 
		
		int poeng = Integer.parseInt(input);
		
		
		
		if (poeng < 0 || poeng > 100) {
			JOptionPane.showMessageDialog(null, "You have to write a number between 0 and 100!");
			i--;
		}
		
		else {
		
		String karakter;
		switch (poeng / 10) {
		case 10:
		case 9:
			karakter = "A"; //90-100
			break;
		case 8:
			karakter = "B"; //80-89
			break;
		case 7:
		case 6:
			karakter = "C"; //60-79
			break;
		case 5:
			karakter = "D"; //50-59
			break;
		case 4:
			karakter = "E"; //40-49
			break;
		default:
			karakter = "F"; //0-39
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Your grade is: " + karakter);
		} }
	}

}
