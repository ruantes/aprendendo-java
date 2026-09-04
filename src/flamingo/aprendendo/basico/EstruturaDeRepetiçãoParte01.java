package flamingo.aprendendo.basico;
import java.util.Scanner;
public class EstruturaDeRepetiçãoParte01 {
    public static void main(String[] args) {
        // for
        //while
        //do

        //contador = contador +1
        //contador +=1;
        //contador++
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero para descobrir a tabuada");
        int numeroTabuada = sc.nextInt();

        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numeroTabuada + "x" + contador + "=" + numeroTabuada * contador);
        }

    }
}
