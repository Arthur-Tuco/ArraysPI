import java.util.Scanner;

public class EX12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        int contador = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Qual número pesquisará?: ");
        int pesquisa = sc.nextInt();

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == pesquisa){
                contador++;
            }
        }
        System.out.printf("O número %d aparece %d vezes", pesquisa, contador);
    }
}
