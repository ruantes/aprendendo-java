package flamingo.aprendendo.basico.exercicios50;
import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        String nome;
        byte idade;
        float notaFinal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextByte();
        sc.nextLine();

        System.out.println("Digite a sua nota final: ");
        notaFinal = sc.nextFloat();

        System.out.println("""
                Nome do Aluno: %s
                Idade: %d
                Nota final: %.2f
                """.formatted(nome, idade, notaFinal));
    }
}
