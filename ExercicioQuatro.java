import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = input.next().charAt(0);

        // Convertendo a letra para minúscula para simplificar a comparação
        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal.");
        } else if ((letra >= 'b' && letra <= 'd') || (letra >= 'f' && letra <= 'h') ||
                   (letra >= 'j' && letra <= 'n') || (letra >= 'p' && letra <= 't') ||
                   (letra >= 'v' && letra <= 'z')) {
            System.out.println("A letra é uma consoante.");
        } else {
            System.out.println("Caractere inválido.");
        }

        input.close();
    }
}