import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = input.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = input.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = input.nextDouble();

        double menorPreco = preco1;
        String produtoMenorPreco = "Produto 1";

        if (preco2 < menorPreco) {
            menorPreco = preco2;
            produtoMenorPreco = "Produto 2";
        }

        if (preco3 < menorPreco) {
            menorPreco = preco3;
            produtoMenorPreco = "Produto 3";
        }

        System.out.println("Você deve comprar o " + produtoMenorPreco + ", pois é o mais barato.");

        input.close();
    }
}
