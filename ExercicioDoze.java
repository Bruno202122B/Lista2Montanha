import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR;
        if (salarioBruto <= 900.0) {
            descontoIR = 0.0;
        } else if (salarioBruto <= 1500.0) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.0) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        double descontoINSS = salarioBruto * 0.1;
        double descontoSindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;

        double totalDescontos = descontoIR + descontoINSS + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (" + (descontoIR / salarioBruto) * 100 + "%): R$ " + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + descontoINSS);
        System.out.println("(-) Sindicato (3%): R$ " + descontoSindicato);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
