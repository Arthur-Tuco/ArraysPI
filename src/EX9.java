import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i= 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        int maior = 0;
        int menor = 0;

        for (int i= 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.printf("O menor número foi: %d\n", menor);
        System.out.printf("O maior número foi: %d\n", maior);
    }
}
