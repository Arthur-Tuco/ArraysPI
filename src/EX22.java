import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] produtos = new int[12];
        int soma = 0;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o preço do " + (i + 1) + "º produto:");
            produtos[i] = sc.nextInt();

            soma += produtos[i];
        }

        int menor = produtos[0];
        int indiceMenor = 0;

        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i] < menor) {
                menor = produtos[i];
                indiceMenor = i;
            }
        }

        double media = soma / 12.0;

        System.out.println("Preço médio: R$ " + media);
        System.out.println("Produto mais barato: Produto " + (indiceMenor + 1));
        System.out.println("Preço: R$ " + menor);

        System.out.println("Produtos acima de R$100,00:");

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] > 100) {
                System.out.println("Produto " + (i + 1) + ": R$ " + produtos[i]);
            }
        }
    }
}