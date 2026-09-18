package flamingo.aprendendo.basico.exercicioArray;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: \n", i + 1);
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println(soma);
        sc.close();
    }
}
