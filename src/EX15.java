import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num1 = new int[8];
        int[] num2 = new int[8];

        for (int i = 0; i < num1.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número do primeiro vetor");
            num1[i] = sc.nextInt();
        }
        for (int i = 0; i < num2.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número do segundo vetor");
            num2[i] = sc.nextInt();
        }
        System.out.println("Os números iguai são: ");
        for (int i = 0; i < num1.length; i++){
            boolean igual = false;

            for(int j = 0; j < i; j++){
                if (num1[i] == num1[j]){
                    igual = true;
                    break;
                }
            }if (igual){
                continue;
            }
            for(int j = 0; j < num2.length; j++){
                if (num1[i] == num2[j]){
                    System.out.println(num1[i]);
                    break;
                }
            }
        }
    }
}
