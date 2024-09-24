package EstruturasCondicionais;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*2- Faça um algoritmo que receba dois números inteiros e um
        caractere representando uma operação aritmética (+, -, * ou
        /). Se o caractere não for válido, o programa deve imprimir
        "Operação inválida". O programa de imprimir o resultado da
        operação aritmética entre os dois números.*/


        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite a operação aritmética (+, -, * ou /):");
        char operacao = sc.next().charAt(0);

        switch (operacao){

            case '+':
                System.out.println("O resultado é " + (num1 + num2));
                break;
            case '-':
                System.out.println("O resultado é + " + ( num1 - num2));
                break;
            case '*':
                System.out.println("O resultado é " + (num1 * num2));
                break;
            case '/':
                System.out.println("O resultado é " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida!");
        }

    }
}
