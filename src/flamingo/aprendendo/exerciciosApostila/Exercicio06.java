package flamingo.aprendendo.exerciciosApostila;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double altura, base, area;
        System.out.println("Digite a base do retângulo: ");
        base = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        System.out.printf("A area do retângulo é = %.2f", area);
        sc.close();
    }
}
