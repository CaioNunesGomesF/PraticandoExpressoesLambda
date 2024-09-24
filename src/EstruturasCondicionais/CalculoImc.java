package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {

        /*3 - Faça um algoritmo em Java que receba o peso (em kg) e a
        altura (em metros) de uma pessoa, e calcule o Índice de Massa
        Corporal (IMC). Fórmula do IMC: IMC = peso / (altura * altura)
        O programa deve classificar o IMC da seguinte forma:
        */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        // Converter para metros

        double alturaEmMetros = altura / 100;
        System.out.println(alturaEmMetros);
        // Cálculo de imc

        double imc = peso / (alturaEmMetros * alturaEmMetros);
        System.out.println(imc);
        // Saida de dados

        if(imc < 18.5){
            System.out.println("Abaixo do peso!");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Peso normal!");
        } else if(imc > 25.0 && imc < 29.9){
            System.out.println("Sobrepeso!");
        } else if(imc > 30.0){
            System.out.println("Obesidade!");
        }

    }
}
