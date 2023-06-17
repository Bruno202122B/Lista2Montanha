import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDia;

        System.out.print("Digite um número (1 a 7) para representar um dia da semana: ");
        numeroDia = scanner.nextInt();

        String diaSemana;
        switch (numeroDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido";
                break;
        }

        System.out.println("O número " + numeroDia + " corresponde a " + diaSemana + ".");

        scanner.close();
    }
}
