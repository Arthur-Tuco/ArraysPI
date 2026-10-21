import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º número para fazermos a soma: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Soma: ");
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}
