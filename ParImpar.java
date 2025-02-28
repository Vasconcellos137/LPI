//Elaborar um algoritmo em fluxograma que solicite para o usuário
//digitar um valor inteiro maior que zero e verifique se este valor é par ou ímpar.

import java.util.Scanner;

public class ParImpar {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int num = 0;

        while (true) { 
        System.out.println("Número: ");
        num = LER.nextInt();


        if (num%2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ìmpar");
        }
    }
}}
