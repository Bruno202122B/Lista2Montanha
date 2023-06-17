import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioAtual, percentualAumento, valorAumento, novoSalario;

        System.out.print("Digite o salário atual do colaborador: ");
        salarioAtual = scanner.nextDouble();

        if (salarioAtual <= 280.0) {
            percentualAumento = 0.2;
        } else if (salarioAtual <= 700.0) {
            percentualAumento = 0.15;
        } else if (salarioAtual <= 1500.0) {
            percentualAumento = 0.1;
        } else {
            percentualAumento = 0.05;
        }

        valorAumento = salarioAtual * percentualAumento;
        novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);

        scanner.close();
    }
}


