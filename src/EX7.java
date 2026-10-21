import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] numero = new float[8];

        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite o " + (i+1) + "º número para calcularmos a média: ");
            numero[i] = sc.nextFloat();
        }
        float media = 0, soma = 0;
        for(int i = 0; i < numero.length; i++){
            soma = soma + numero[i];
            media = soma / numero.length;
        }
        System.out.println(media);
    }
}
