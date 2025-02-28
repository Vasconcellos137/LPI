//01. Elaborar um algoritmo em fluxograma que leia a altura dos andares de
//um prédio e o número de andares, calcule e imprima a altura do prédio.

import java.util.Scanner;

public class ex1 {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
    
        int altura = 0;
        int nundares = 0;

        System.out.println("Altura: ");
        altura = LER.nextInt();

        System.out.println("Número de Andares: ");
        nundares = LER.nextInt();

        int caulcuolo = 0;
        caulcuolo = altura*nundares;


        System.out.println("Resultado:" + caulcuolo);

    }
}
