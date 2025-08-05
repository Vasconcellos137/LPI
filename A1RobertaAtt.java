//05.08.25 - Lista de If-Else

import java.util.Scanner;

public class A1RobertaAtt {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        // Ex 3
        // int numA = 0;
        // int numB = 0;
        // numA = lerInt();
        // numB = lerInt();

        // System.out.println(resultEx3(numA, numB));

        // Ex 4
        // int num4 = lerInt();
        // System.out.println(resultEx4(num4));

        // Ex 6
        int n1 = lerInt();
        int n2 = lerInt();
        int n3 = lerInt();

        resultEx6(n1, n2, n3);
    }

    public static int lerInt() {
        int num = LER.nextInt();
        return num;
    }

    // Ex 3
    public static int resultEx3(int numA, int numB) {
        int resp = 0;

        if (numA == numB) {
            resp = numA + numB;
        } else {
            resp = numA * numB;
        }

        return resp;
    }

    // Ex 4
    public static int resultEx4(int num4) {
        int resp = 0;

        if (num4 > 0) {
            resp = num4 * 2;
        } else {
            resp = num4 * 3;
        }
        return resp;
    }

    // Ex 6 6. Escreva um algoritmo que leia três valores inteiros e diferentes e
    // mostre-os em ordem decrescente.

    public static void resultEx6(int n1, int n2, int n3) {

        if (n1 < n2) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        } else if (n2 < n1) {
            System.out.println(n1 + ", " + n2 + ", " + n3);
        } else if () {
            
        }
    }
}
