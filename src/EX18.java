import java.util.Scanner;

public class EX18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ")
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++){
            for (int j = 0; j < numeros.length - 1 - i; j++){
                if (numeros[j] > numeros[j + i]{
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        System.out.println("\nNúmeros em ordem crescente: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " ");
        }
    }
}
