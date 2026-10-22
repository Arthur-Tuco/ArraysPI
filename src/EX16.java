import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] resultado = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Digite um número multiplicador: ");
        int multiplicador = sc.nextInt();

        for (int i = 0; i < numeros.length; i++){
            resultado[i] = numeros[i] * multiplicador;
        }
        System.out.println("Resultado: ");
        for (int i = 0; i < resultado.length; i++){
            System.out.println(resultado[i]);
        }
    }
}
