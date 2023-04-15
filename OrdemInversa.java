/*Crie um programa em Java para ler e armazenar 10 números inteiros em um vetor, em seguida imprimir esses números na ordem 
inversa da leitura, ou seja, o último número lido deve ser o primeiro a ser exibido */

import java.util.Scanner;

public class OrdemInversa{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int numeros [];
        numeros = new int[10];
        int l;

        for(l=0; l<10; l++){
            System.out.print("Digite o " + (l+1) + "° valor do vetor: ");
            numeros[l] = entrada.nextInt();
        }
        System.out.println("Conteúdo do vetor: \n");
        for(l=10-1;l>=0;l--){
            System.out.println("Valor " + (l) + " do vetor:" + numeros[l]);
        }

        entrada.close();
    }
}