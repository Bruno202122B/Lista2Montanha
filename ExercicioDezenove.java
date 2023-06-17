import java.util.Scanner;

public class ExercicioDezenove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, centenas, dezenas, unidades;

        System.out.print("Digite um número inteiro menor que 1000: ");
        numero = scanner.nextInt();

        centenas = numero / 100;
        dezenas = (numero % 100) / 10;
        unidades = numero % 10;

        String textoCentenas = formatarNumero(centenas, "centena");
        String textoDezenas = formatarNumero(dezenas, "dezena");
        String textoUnidades = formatarNumero(unidades, "unidade");

        System.out.println(numero + " = " + textoCentenas + ", " + textoDezenas + " e " + textoUnidades);

        scanner.close();
    }

    public static String formatarNumero(int numero, String tipo) {
        if (numero == 0) {
            return "";
        } else if (numero == 1) {
            return "1 " + tipo;
        } else {
            return numero + " " + tipo + "s";
        }
    }
}
