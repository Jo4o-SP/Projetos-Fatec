/*Programa para armazenar 5 números inteiros em um vetor Ao final mostrar apenas os números positivos contidos no vetor*/
import java.util.Scanner;

public class InteirosPositivos {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int numeros [];
        numeros = new int[6];
        int l;

        System.out.println("Digite 5 valores entre negativos e positivos!");
        for(l=1;l<6;l++){
            System.out.print("Digite um valor para o " +(l)+ "° vetor: ");
            numeros[l] = entrada.nextInt();
        }
        for(l=1;l<6;l++){
            if(numeros[l] > 0){
                System.out.println("O seguinte vetor " +(l)+ " tem seu valor positivo: " + numeros[l]);
            }
        }
        
        entrada.close();
    }
}
