package flamingo.aprendendo.basico.exercicioArray;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaFinal = 0, media = 0;
        double[] notas = new double[4];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %dº nota: \n", i + 1);
            notas[i] = sc.nextDouble();
            media += notas[i];
        }
        mediaFinal = (media / 4);
        System.out.printf("A nota final do aluno é %.2f", mediaFinal);
        sc.close();
    }
}
