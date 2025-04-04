/* 11. Faça um algoritmo que, para um número indeterminado de pessoas: leia a idade de cada
pessoa, sendo que a idade 0 (zero), ou menor, indica o fim da leitura e não deve ser
considerada.
A seguir calcule e imprima:
• O número de pessoas;
• A idade média do grupo;  */

import java.util.Scanner;
public class ex3TestsNew {
     final static Scanner LER = new Scanner(System.in);
     public static void main(String[] args) {
        int cont = 0;
        int somaIdds = 0;
        float media = 0f;
        int idade = 0;

        while (true) {

            idade = LER.nextInt();
            if (idade <= 0) {
                break;
            }

            somaIdds += idade;
            cont += 1;

        }

        media = (float)somaIdds/cont;

        System.out.println("Números de pessoas: " + cont);
        System.out.println("Média do grupo: " + media);

    }
}
