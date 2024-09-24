package EstruturasDeRepeticao;

public class SomaPar {

    public static void main(String[] args) {

        /*1- Faça um algoritmo em Java que calcule a soma todos
        os números pares entre 1 e 100. O programa deve
        imprimir o resultado da soma.
        */

        int soma = 0;

        for(int i=0;i<100;i++){
            if(i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos números pares é " + soma + ".");
    }
}
