import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];
        int[] diferentes = new int[12];
        int totalDiferentes = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            boolean jaExiste = false;

            for (int j = 0; j < totalDiferentes; j++) {
                if (numeros[i] == diferentes[j]) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                diferentes[totalDiferentes] = numeros[i];
                totalDiferentes++;
            }
        }

        System.out.println("Valores diferentes encontrados: ");
        for (int i = 0; i < totalDiferentes; i++) {
            System.out.print(diferentes[i] + " ");
        }
    }
}
