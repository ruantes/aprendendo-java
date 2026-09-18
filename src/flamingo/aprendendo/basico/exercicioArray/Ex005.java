package flamingo.aprendendo.basico.exercicioArray;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: \n", i + 1);
            numeros[i] = sc.nextInt();
            }

        int maior = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
            System.out.printf("O maior número é %d", maior);
    }
}
