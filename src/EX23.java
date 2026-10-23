import java.util.Scanner;

public class EX23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] dias = {
                "Domingo",
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado",
        };
        int[] vendas = new int[7];
        int total = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Quantas vendas houve no(a) " + dias[i] + "?");
            vendas[i] = sc.nextInt();
        }

        for (int i =0; i < vendas.length; i++){
            total += vendas[i];
        }

        double media = total / 7.0;
        int maior = vendas[0];
        int indiceMaior = 0;

        for(int i = 1; i < vendas.length; i++){
            if(vendas[i] > maior){
                maior = vendas[i];
                indiceMaior = i;
            }
        }
        System.out.println("O total da semana foi: " + total);
        System.out.println("Média diária foi: " + media);
        System.out.println("Dia com mais vendas: " + dias[indiceMaior]);

        System.out.println("Dias acima da média: ");
        for (int i = 0; i < vendas.length; i++) {
            if(vendas[i] > media){
                System.out.println(dias[i]);
            }
        }
    }
}
