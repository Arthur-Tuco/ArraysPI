import java.util.Scanner;

public class EX25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int menu;
        do {
            System.out.println("1 - Exibir elementos");
            System.out.println("2 - Soma e média");
            System.out.println("3 - Maior e menor");
            System.out.println("4 - Pesquisar número");
            System.out.println("5 - Ordem inversa");
            System.out.println("6 - Encerrar");

            menu = sc.nextInt();

            switch(menu) {
                case 1:
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println(numeros[i] + " ");
                        }
                    break;
                case 2:
                    int soma = 0;

                    for(int i = 0; i < numeros.length; i++) {
                        soma += numeros[i];
                    }
                    double media = soma / 10.0;
                    System.out.println("Soma: " + soma);
                    System.out.println("Media: " + media);
                    break;
                case 3:
                    int maior = numeros[0];
                    int menor = numeros[0];

                    for(int i = 1; i < numeros.length; i++) {
                        if (numeros[i] > maior) {
                            maior = numeros[i];
                        }
                        if (numeros[i] < menor) {
                            menor = numeros[i];
                        }
                    }
                    System.out.println("Maior: " + maior);
                    System.out.println("Menor: " + menor);
                    break;
                case 4:
                    System.out.println("Digite um número para pesquisar: ");
                    int pesquisa = sc.nextInt();

                    boolean encontrou = false;

                    for (int i = 0; i < numeros.length; i++) {
                        if(numeros[i] == pesquisa) {
                            encontrou = true;
                            break;
                        }
                    }
                    if(encontrou) {
                        System.out.println("Número encontrado.");
                    }else{
                        System.out.println("Número não encontrado.");
                    }
                    break;
                case 5:
                    for (int i = numeros.length - 1; i >= 0; i--) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();

                    System.out.println("Resultado: ");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    break;
                case 6:
                    if (menu > 6){
                        System.out.println("Saindo!");
                        break;
                    }
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (menu != 6);
    }
}
