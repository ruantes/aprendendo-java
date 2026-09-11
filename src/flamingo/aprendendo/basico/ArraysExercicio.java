package flamingo.aprendendo.basico;

public class ArraysExercicio {
    static void main() {
        int[][] calendario = new int[12][31];

        for(int i = 0; i < calendario.length; i++){
            for(int j = 0; j < calendario[i].length; j++){
            calendario[i][j] = j + 1;
                System.out.println(calendario[i][j]);
            }
        }
    }
}
