import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for(int i = 0; i < num1.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número para o primeiro vetor: ");
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número para o segundo vetor: ");
            num2[i] = sc.nextInt();
        }

        int[] soma = new int[10];

        for(int i = 0; i < soma.length; i++){
            soma[i] = num1[i] + num2[i];
        }
        for (int i = 0; i < soma.length; i++){
            System.out.println("Posição " + i + ": " + soma[i]);
        }
    }
}
