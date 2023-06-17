import java.util.Scanner;

public class ExercicioVinteTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (ehInteiro(numero)) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }

        scanner.close();
    }

    public static boolean ehInteiro(double numero) {
        return Math.round(numero) == numero;
    }
}
