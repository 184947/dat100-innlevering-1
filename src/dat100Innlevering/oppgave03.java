package dat100Innlevering;

import static javax.swing.JOptionPane.*;

public class oppgave03 {

    public static void main(String[] args) {
        
        String input = showInputDialog("Skriv inn et heltall n:  ");
                
                int n = Integer.parseInt(input);
                
                long result = Beregn(n);
                
                if (n>0) {
                    
                    showMessageDialog(null,  "Verdien av:  " + n + " er fakultetet:  " + result);
                
                }
                else {
                    showMessageDialog(null,  "Du er nødt å skrive inn n>0!");
                }
    }
    
    public static long Beregn (int n) {
        
        long result = 1;
        
        for (int i = 1; i<= n; i++) {
            
            result *= i;
        }
        
        return result;
    }
}


