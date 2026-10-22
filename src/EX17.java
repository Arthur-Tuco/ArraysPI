import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        int[] negativos = new int[15];
        int[] positivos = new int[15];
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "ºnúmero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos[pos] = numeros[i];
                pos++;
            } else if (numeros[i] < 0) {
                negativos[neg] = numeros[i];
                neg++;
            }
        }
        System.out.println("Positivos: ");
        for (int i = 0; i < pos; i++){
            System.out.println(positivos[i] + " ");
        }
        System.out.println("Negativos: ");
        for (int i = 0; i < neg; i++){
            System.out.println(negativos[i] + " ");
        }
    }
}