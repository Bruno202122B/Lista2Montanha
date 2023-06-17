import java.util.Scanner;

public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Digite o valor do lado 1: ");
        lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do lado 2: ");
        lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do lado 3: ");
        lado3 = scanner.nextDouble();

        boolean formaTriangulo = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if (formaTriangulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }
}
