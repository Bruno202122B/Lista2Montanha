import java.util.Scanner;

public class ExercicioVinteSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoLitroGasolina = 2.50;
        double precoLitroAlcool = 1.90;
        double valorPago = 0.0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorPago = litros * precoLitroAlcool * 0.97; // Desconto de 3%
            } else {
                valorPago = litros * precoLitroAlcool * 0.95; // Desconto de 5%
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorPago = litros * precoLitroGasolina * 0.96; // Desconto de 4%
            } else {
                valorPago = litros * precoLitroGasolina * 0.94; // Desconto de 6%
            }
        } else {
            System.out.println("Tipo de combustível inválido. Encerrando o programa.");
            scanner.close();
            return;
        }

        System.out.println("Valor a ser pago: R$" + valorPago);

        scanner.close();
    }
}
