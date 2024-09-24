package EstruturasDeRepeticao;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*2- Faça um algoritmo em Java que receba um número
        inteiro positivo e verifique se ele é um número
        primo. Ao final, imprima "É primo" ou "Não é primo".
        */
        int numero;

        do {
            System.out.print("Digite um numero inteiro e positivo: ");
            numero = sc.nextInt();
            if(numero < 0 ){
                System.out.println("\nNumero inválido!\n");
            }
        }while(numero < 0);





    }

}
