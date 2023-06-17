import java.util.Scanner;

public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano;

        System.out.print("Digite a data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();

        String[] dataPartes = dataString.split("/");

        if (dataPartes.length != 3) {
            System.out.println("Data inválida.");
            scanner.close();
            return;
        }

        dia = Integer.parseInt(dataPartes[0]);
        mes = Integer.parseInt(dataPartes[1]);
        ano = Integer.parseInt(dataPartes[2]);

        boolean dataValida = verificarData(dia, mes, ano);

        if (dataValida) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }

    public static boolean verificarData(int dia, int mes, int ano) {
        if (ano < 1) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasPorMes[1] = 29; // Ano bissexto, fevereiro tem 29 dias
        }

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }
}
