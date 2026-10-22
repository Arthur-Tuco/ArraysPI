import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Qual número deseja pesquisar?: ");
        int pesquisa = sc.nextInt();

        boolean encontrou = false;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == pesquisa){
                encontrou = true;
                break;
            }
        }
        if (encontrou){
            System.out.println("O número " + pesquisa + " está na lista!");
        }else {
            System.out.println("O número " + pesquisa + " não está na lista!");
        }
    }
}
