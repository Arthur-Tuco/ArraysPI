import java.util.Scanner;

public class EX21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[20];
        int aprovados = 0;
        int soma = 0;
        int maior;
        int menor;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota do " + (i +1 ) + "º aluno: ");
            notas[i] = sc.nextInt();

            soma += notas[i];

            if (notas[i] >= 7){
                aprovados++;
            }
        }

        maior  = notas[0];
        menor = notas[0];

        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        double media = soma/20.0;

        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Alunos aprovados: " + aprovados);
    }
}
