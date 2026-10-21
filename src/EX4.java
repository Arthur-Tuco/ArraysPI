import java.util.Scanner;

public class EX4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nOs números de ordem invertida são: ");
        for(int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
