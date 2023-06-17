import java.util.Scanner;

public class ExercicioVinteOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Hipermercado Tabajara!");
        System.out.println("Promoção de Carnes:");

        double precoFileDuploAte5Kg = 4.90;
        double precoFileDuploAcima5Kg = 5.80;
        double precoAlcatraAte5Kg = 5.90;
        double precoAlcatraAcima5Kg = 6.80;
        double precoPicanhaAte5Kg = 6.90;
        double precoPicanhaAcima5Kg = 7.80;

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.print("Digite o número correspondente ao tipo de carne escolhido: ");
        int tipoCarne = scanner.nextInt();

        System.out.print("Digite a quantidade em Kg: ");
        double quantidade = scanner.nextDouble();

        double precoTotal = 0.0;
        String tipoCarneNome = "";

        switch (tipoCarne) {
            case 1:
                tipoCarneNome = "File Duplo";
                if (quantidade <= 5) {
                    precoTotal = quantidade * precoFileDuploAte5Kg;
                } else {
                    precoTotal = quantidade * precoFileDuploAcima5Kg;
                }
                break;
            case 2:
                tipoCarneNome = "Alcatra";
                if (quantidade <= 5) {
                    precoTotal = quantidade * precoAlcatraAte5Kg;
                } else {
                    precoTotal = quantidade * precoAlcatraAcima5Kg;
                }
                break;
            case 3:
                tipoCarneNome = "Picanha";
                if (quantidade <= 5) {
                    precoTotal = quantidade * precoPicanhaAte5Kg;
                } else {
                    precoTotal = quantidade * precoPicanhaAcima5Kg;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.print("A compra será feita no cartão Tabajara? (S/N): ");
        String opcaoCartao = scanner.next();

        boolean cartaoTabajara = opcaoCartao.equalsIgnoreCase("S");

        double desconto = 0.0;
        double valorPagar = 0.0;

        if (cartaoTabajara) {
            desconto = precoTotal * 0.05;
            valorPagar = precoTotal - desconto;
        } else {
            valorPagar = precoTotal;
        }

        System.out.println("\nCupom Fiscal");
        System.out.println("Tipo de carne: " + tipoCarneNome);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$" + precoTotal);
        System.out.println("Tipo de pagamento: " + (cartaoTabajara ? "Cartão Tabajara" : "Outro"));
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$" + valorPagar);

        scanner.close();
    }
}
