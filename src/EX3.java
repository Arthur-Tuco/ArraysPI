import java.util.Scanner;

public class EX3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[6];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + "º nota: ");
            notas[i] = sc.nextFloat();
        }

        System.out.println("\nAs notas foram: ");
        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
    }
}
