import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();

        double resultado = 0.0;
        String operacao = "";

        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                operacao = "soma";
                break;
            case 2:
                resultado = numero1 - numero2;
                operacao = "subtração";
                break;
            case 3:
                resultado = numero1 * numero2;
                operacao = "multiplicação";
                break;
            case 4:
                resultado = numero1 / numero2;
                operacao = "divisão";
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                scanner.close();
                return;
        }

        System.out.println("Resultado da " + operacao + ": " + resultado);

        verificarCaracteristicas(resultado);

        scanner.close();
    }

    public static void verificarCaracteristicas(double numero) {
        String parImpar = (numero % 2 == 0) ? "par" : "ímpar";
        String positivoNegativo = (numero >= 0) ? "positivo" : "negativo";
        String inteiroDecimal = (numero == (int) numero) ? "inteiro" : "decimal";

        System.out.println("Características do número resultante:");
        System.out.println("Par ou ímpar: " + parImpar);
        System.out.println("Positivo ou negativo: " + positivoNegativo);
        System.out.println("Inteiro ou decimal: " + inteiroDecimal);
    }
}
