import java.util.Scanner;

public class MenorEPos{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 0;
        int menorValor = 999;
        int posicaoMenorValor = 0;

        n = lerInt();
        int[] x = criarVetor(n);
        x = lerVetor(x);
        menorValor = acharMenorValor(x, menorValor);
        posicaoMenorValor = posicaoMenorValor(menorValor, posicaoMenorValor, x);
        imprimirVetior(menorValor, posicaoMenorValor);
    }

    public static int posicaoMenorValor(int menorValor, int posicaoMenorValor, int[] x){
        for (int i = 0; i < x.length; i++) {
            if (menorValor == x[i]) {
                posicaoMenorValor = i;
            }
        }
        return posicaoMenorValor;
    }

    public static int lerInt(){
        int x = 0;
        while (x < 1 || x > 1000) {
            x = LER.nextInt();
        }
        return x;
    }
    public static int[] lerVetor(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        return vet;
    }

    public static int acharMenorValor(int[] vetor, int menorValor){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        return  menorValor;
    }

    public static int[] criarVetor(int n){
        int[] vetor = new int[n];
        return vetor;
    }

    public static void imprimirVetior(int menorValor, int posicaoMenorValor){
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenorValor);
    }
}
