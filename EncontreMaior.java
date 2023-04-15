/*Crie um programa, usando o conceito de vetores, para ler e armazenar um conjunto de 5 números inteiros
Encontrar e exibir o maior número */

import java.util.Scanner;

public class EncontreMaior {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);

        int numeros [];
        numeros = new int[5];
        int l;
        int maior;
        maior = 0;

        for(l=0;l<5;l++){
            System.out.print("Digite os valores do vetor " +(l)+": ");
            numeros[l] = entrada.nextInt();
        }
        for(l=0;l<5;l++){
        System.out.println("Valores dos vetores " +(l)+": " + numeros[l]);
            if(numeros[l] > maior){
                maior = numeros[l];
            }
        }

        System.out.println("O maior número é: " + maior);

        entrada.close();
    }
}
