package flamingo.aprendendo.exerciciosApostila;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para saber o seu antecessor: ");
        int numero = sc.nextInt();
        int valorFinal = numero - 1;
        System.out.println("O número antecessor do valor digitado é " + valorFinal);
        sc.close();
    }
}
