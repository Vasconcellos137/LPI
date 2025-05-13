import java.util.Scanner;

public class Aula1_1ano_Oda {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        float area = 0f;
        float altura = 0f;
        float base = 0f;

        imprimirTexto("Altura:");
        altura = lerNumReal();

        imprimirTexto("Base:");
        base = lerNumReal();

        area = calcularAreaTrinangulo(altura, base);
        imprimirResul(area);
    }

public static void imprimirTexto(String texto){
    System.out.println(texto);
}

public static float lerNumReal(){
    float num = 0f;
    num = LER.nextFloat();
    return num;
}

public static float calcularAreaTrinangulo(float altura, float base){
    float area = 0f;
    area = (base*altura)/2;
    return area;
}

public static void imprimirResul(float area){
    System.out.println("Resultado:");
    System.out.println(area);
}
}
