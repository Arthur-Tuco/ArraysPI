import java.util.Scanner;

public class EX19{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] num1 = new int[10];
    int[] num2 = new int[10];

    for(int i = 0; i < num1.length; i++){
      System.out.println("Digite o " + (i + 1) + "º número para o primeiro vetor: ");
      num1[i] = sc.nextInt();
    }
    for(int i = 0; i < num2.length; i++){
      System.out.println("Digite o " + (i + 1) + "º número para o segundo vetor: ");
      num2[i] = sc.nextInt();
    }
    boolean iguais = true;

    for (int i = 0; i < num1.length; i++){
      if(num1[i] != num2[i]){
        iguais = false;
        break;
      }
    }
    if(iguais){
      System.out.println("Os vetores são iguais (posição e valor)");
    }
    else{
      System.out.println("Os vetores não são iguais.");
    }
    }
  }
