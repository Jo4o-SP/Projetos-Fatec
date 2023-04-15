/*Faça um programa para ler e armazenar 5 números inteiros em um vetor. Calcular a soma dos elementos
(números) que estão nos índices ímpares do vetor */

import java.util.Scanner;

public class CalcularElementos {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int numeros [];
        numeros = new int[6];
        int l;
        int soma;
        soma = 0;

        for(l=0;l<6;l++){
            System.out.print("Digite o valor do " +(l)+ "° vetor: ");
            numeros[l] = entrada.nextInt();
        }
        
        for(l=0;l<6;l++){
            if(l % 2 != 0){
            System.out.println("Os seguintes vetores " +(l)+ " são impares, seus valores são " + numeros[l]);
            soma += numeros[l];
            }
        }
        System.out.println("O valor total da soma desse valores é igual à " + soma);
        entrada.close();
    }
}
