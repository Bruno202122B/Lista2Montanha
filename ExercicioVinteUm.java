import java.util.Scanner;

public class ExercicioVinteUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorSaque;
        int quantidadeNotas100, quantidadeNotas50, quantidadeNotas10, quantidadeNotas5, quantidadeNotas1;

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido!");
        } else {
            quantidadeNotas100 = valorSaque / 100;
            valorSaque %= 100;

            quantidadeNotas50 = valorSaque / 50;
            valorSaque %= 50;

            quantidadeNotas10 = valorSaque / 10;
            valorSaque %= 10;

            quantidadeNotas5 = valorSaque / 5;
            valorSaque %= 5;

            quantidadeNotas1 = valorSaque;

            System.out.println("Notas fornecidas:");
            System.out.println("Notas de 100 reais: " + quantidadeNotas100);
            System.out.println("Notas de 50 reais: " + quantidadeNotas50);
            System.out.println("Notas de 10 reais: " + quantidadeNotas10);
            System.out.println("Notas de 5 reais: " + quantidadeNotas5);
            System.out.println("Notas de 1 real: " + quantidadeNotas1);
        }

        scanner.close();
    }
}
