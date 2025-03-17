import java.util.Scanner;

public class mEp {
        final static Scanner LER = new Scanner(System.in);

        public static void main(String[] args) {//utilizando vetor:
            int n; //int n = 0;
            n = LER.nextInt(); //lerInt();
            int[] menorEPosicao = new int[2];// vetor ao qual o indice [0] 
            //- é o menor valor do vet definido pelo usuario e [1] é a posição desse valor
            //| [0] == int menorValor = 0; | [1] == int indiceMenorvalor = 0;|
            int[] vetor = new int[n];
            vetor = preencherVetor(vetor);// percorre o vetor de 1 a 1, preenchendo cada espaço com um numero 'x' digitado pelo usuario
            menorEPosicao = encontrarMenorValorESuaPosicao(vetor, menorEPosicao);// encontra o menor valor do vetor 'vetor' e armazena no vetor 
            //menorEPosicao[0], armazena o indice (i) desse valor no vetor 'menorEPosicao'[1]
            imprimirVetor(menorEPosicao);//imprime o menor valor e sua posição no vetor digitado pelo usuario
            //fim
        }
}
