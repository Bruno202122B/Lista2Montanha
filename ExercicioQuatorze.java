import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        String conceito, situacao;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        System.out.println("Notas: " + nota1 + " e " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
