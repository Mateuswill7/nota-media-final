import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double [4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota do aluno no bimestre " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Média final do aluno " + media);

    
        
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        sc.close();
    }

}
