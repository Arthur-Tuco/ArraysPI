import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextDouble();
        }
        double media = 0, soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            media = soma / numeros.length;
        }
        System.out.printf("A média é: %.2f \nE os números acima de média foram: ", media);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media){
                System.out.println(numeros[i]);
            }
        }
    }
}