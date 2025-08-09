import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double [4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            while (true) {
                System.out.printf("Digite a nota do aluno no " + (i + 1) + "º Bimestre: ");    
                double nota = Double.parseDouble(sc.next().replace(",", "."));

            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
                soma += nota;
                break;            
            } else {
                System.out.println("Nota Inválida! Digite uma nota de 0 a 10.");
            }
        }   
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
