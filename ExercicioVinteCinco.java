import java.util.Scanner;

public class ExercicioVinteCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as seguintes perguntas com Sim ou Não:");
        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.nextLine();
        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.nextLine();
        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.nextLine();
        System.out.print("Devia para a vítima? ");
        String resposta4 = scanner.nextLine();
        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = scanner.nextLine();

        int contadorRespostasPositivas = contarRespostasPositivas(resposta1, resposta2, resposta3, resposta4, resposta5);

        String classificacao;
        if (contadorRespostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (contadorRespostasPositivas >= 3 && contadorRespostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (contadorRespostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    public static int contarRespostasPositivas(String... respostas) {
        int contador = 0;
        for (String resposta : respostas) {
            if (resposta.equalsIgnoreCase("Sim")) {
                contador++;
            }
        }
        return contador;
    }
}
