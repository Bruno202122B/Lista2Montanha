import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra (F/M): ");
        char letra = input.next().charAt(0);

        if (letra == 'F' || letra == 'f') {
            System.out.println("F - Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

        input.close();
    }
}