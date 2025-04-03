import java.util.Scanner;

public class semana{   
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num = 0; 
        System.out.println("Número: ");
        num = lerInt();
        System.out.println(verifcSemana(num));
        
    }
    public static int lerInt(){
        int num = 0;
        num = LER.nextInt();
        while (num > 8 || num <= 0) { //num > 0 && num < 8
            num = LER.nextInt();
        }
        return num;
    }

    public static String verifcSemana(int num){

        if (num == 1) {
            return "dom";
        } else if (num == 2) {
            return "seg";
        } else if (num == 3) {
            return "ter";
        } else if (num == 4) {
            return "qua";
        }  else if (num == 5) {
            return "qui";
        } else if (num == 6) {
            return "sex";
        } else {
            return "sáb";
        }
    }

}
