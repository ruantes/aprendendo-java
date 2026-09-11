package flamingo.aprendendo.basico.exercicios50;
import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        String nome, cidade;
        byte idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = sc.nextLine();

        System.out.println("Qual é a sua idade?");
        idade = sc.nextByte();
        sc.nextLine();

        System.out.println("Qual é a sua cidade?");
        cidade = sc.nextLine();

        System.out.println(nome + " tem " + idade + " anos e mora em " + cidade);
    }
}
