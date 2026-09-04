package flamingo.aprendendo.exerciciosApostila;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosBrancos, votosNulos, votosValidos;
        double porcentagemBrancos, porcentagemNulos, porcentagemValidos;

        System.out.println("Digite o número de votos brancos do seu município: ");
        votosBrancos = sc.nextInt();

        System.out.println("Digite o número de votos nulos do seu município: ");
        votosNulos = sc.nextInt();

        System.out.println("Digite o número de votos válidos do seu município: ");
        votosValidos = sc.nextInt();

        int votosTotais = votosBrancos + votosNulos + votosValidos;
        porcentagemBrancos = ((double)votosBrancos / votosTotais) * 100.0;
        porcentagemNulos = ((double)votosNulos / votosTotais) * 100.0;
        porcentagemValidos = ((double)votosValidos / votosTotais) * 100.0;

        System.out.printf(Locale.forLanguageTag("pt-br"), "O número de votos totais no seu município é de %,d%n\n", votosTotais);
        System.out.printf("Votos brancos: %.2f%%\n", porcentagemBrancos);
        System.out.printf("Votos nulos: %.2f%%\n", porcentagemNulos);
        System.out.printf("Votos válidos: %.2f%%\n", porcentagemValidos);
    }
}
