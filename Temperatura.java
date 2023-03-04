//Qual a temperatura?

import javax.swing.JOptionPane;

public class Temperatura{
    public static void main(String [] args){

        String temp;
        temp = JOptionPane.showInputDialog("Digite a temperatura no seu local");
        double c = Double.parseDouble(temp);

        //Fórmula: F=9sob5 C+32

        double f = 5 * 100 / 9 + c + 32;

        JOptionPane.showMessageDialog(null, "Convertendo celsius em Fahrenheit da " + f) ;
    }
}