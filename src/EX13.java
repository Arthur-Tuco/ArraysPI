import java.util.Scanner;

public class EX13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i =0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Qual o número a pesquisar?: ");
        int pesquisa  = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisa){
                System.out.println("Encontrado na(s) posição(ões): " + i);
                encontrou = true;
            }
            }
        if(!encontrou){
            System.out.println("Não encontrado");
        }
    }
}
