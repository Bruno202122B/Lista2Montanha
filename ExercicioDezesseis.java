import java.util.Scanner;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
        } else {
            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = scanner.nextDouble();

            double delta = calcularDelta(a, b, c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = calcularRaizUnica(a, b);
                System.out.println("A equação possui uma raiz real: " + raiz);
            } else {
                double raiz1 = calcularRaiz1(a, b, delta);
                double raiz2 = calcularRaiz2(a, b, delta);
                System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
            }
        }

        scanner.close();
    }

    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double calcularRaizUnica(double a, double b) {
        return -b / (2 * a);
    }

    public static double calcularRaiz1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public static double calcularRaiz2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
