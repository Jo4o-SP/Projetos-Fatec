//Soma de dois inteiros

import javax.swing.JOptionPane;

public class SomaDois {
    public static void main(String [] agrs){

        String Aux;
        Aux = JOptionPane.showInputDialog("Digite o primeiro numero");
        int n1 = Integer.parseInt(Aux);

        Aux = JOptionPane.showInputDialog("Digite o segundo numero");
        int n2 = Integer.parseInt(Aux);

        int soma = n1 + n2;
        JOptionPane.showMessageDialog(null, "A soma dos seus numeros deu " + soma);

        
    }
}
