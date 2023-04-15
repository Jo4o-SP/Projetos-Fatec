/*Crie um programa em Java para ler e armazenar 5 números inteiros em um vetor e montar outro vetor com os valores do 
primeiro multiplicados por 3 */

import java.util.Scanner;

public class VetorMult {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        
        int numeros [];
        numeros = new int[5];
        int l;

        for(l=0; l<5; l++){
            System.out.print("Digite o valor do " +(l+1)+ "° vetor: ");
            numeros[l] = entrada.nextInt();
        }
        System.out.println("O conteúdo do vetor: \n");
        for(l=1;l<5;l++){
            System.out.println("Valor " +(l)+ " do vetor: " + numeros[l]);
        }

        int mult = numeros[0]*3;

        System.out.println("O valor do 1° vetor multiplicado pro 3 é: " + mult);

        entrada.close();
    }
}