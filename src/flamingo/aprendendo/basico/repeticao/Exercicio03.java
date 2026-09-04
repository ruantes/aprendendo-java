package flamingo.aprendendo.basico.repeticao;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber a tabuada: ");
        int numeroTabuada = sc.nextInt();

        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numeroTabuada + "x" + contador + "=" + numeroTabuada * contador);
            }
    }
}
