package EstruturasCondicionais;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        /*1 - Faça um algoritmo que receba um número inteiro e verifique
        se ele é par ou ímpar. O programa deve imprimir "Par" se o
        número for par e "Ímpar" se for ímpar.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número digitado é par!");
        }
        else{
            System.out.println("O número digitado é impar!");
        }


    }

}
