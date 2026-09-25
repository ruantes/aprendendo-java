package flamingo.aprendendo.Intermediario.test;
import flamingo.aprendendo.Intermediario.Dominio.Calculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int numero01, numero02;
        System.out.println("Digite o primeiro valor: ");
        numero01 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        numero02 = sc.nextInt();

        calculadora.soma(numero01, numero02);
        calculadora.subtrair(numero01, numero02);
        calculadora.multiplicar(numero01, numero02);
    }
}
