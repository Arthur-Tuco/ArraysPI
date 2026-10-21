import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        String pares = "";
        String impares = "";

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares  += numeros[i] + " ";
            }
            else{
                impares  += numeros[i] + " ";
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
