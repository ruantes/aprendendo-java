package flamingo.aprendendo.exerciciosApostila;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, ano, mes, dia;
        System.out.println("Digite a sua idade: ");

        idade = sc.nextByte();

        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();

        ano = idade - anoAtual;
        mes = idade * 12;
        dia = idade * 365;

        System.out.printf("A sua idade em dias é %,d%n", dia);
        sc.close();
    }
}
