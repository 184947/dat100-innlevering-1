package dat100Innlevering;

import static javax.swing.JOptionPane.*;

public class oppgave02 {
    public static void main(String[] args) {
       
        String inntektTxt = showInputDialog("Skriv inn bruttoinntekten din:");
        double bruttoinntekt = Double.parseDouble(inntektTxt);

        double trinnskatt = beregnTrinnskatt(bruttoinntekt);

        showMessageDialog(null, "Trinnskatten for inntekt på " + bruttoinntekt + " kr er: " + trinnskatt + " kr");
    }

    public static double beregnTrinnskatt(double bruttoinntekt) {
        double trinnskatt = 0;

        if (bruttoinntekt > 2_037_200) {
            trinnskatt += (bruttoinntekt - 2_037_200) * 0.174;
            bruttoinntekt = 2_037_200;
        }
        if (bruttoinntekt > 1_321_400) {
            trinnskatt += (bruttoinntekt - 1_321_400) * 0.162;
            bruttoinntekt = 1_321_400;
        }
        if (bruttoinntekt > 745_200) {
            trinnskatt += (bruttoinntekt - 745_200) * 0.132;
            bruttoinntekt = 745_200;
        }
        if (bruttoinntekt > 313_800) {
            trinnskatt += (bruttoinntekt - 313_800) * 0.042;
            bruttoinntekt = 313_800;
        }
        if (bruttoinntekt > 208_050) {
            trinnskatt += (bruttoinntekt - 208_050) * 0.019;
        }

        return trinnskatt;
    }
}