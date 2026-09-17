package flamingo.aprendendo.basico.revisaoarray;

public class ArraysParte05 {
    public static void main(String[] args) {
        int[][] diasDosMeses = new int[12][];

        diasDosMeses[0] = new int [31];
        diasDosMeses[1] = new int [28];
        diasDosMeses[2] = new int [31];
        diasDosMeses[3] = new int [30];
        diasDosMeses[4] = new int [31];
        diasDosMeses[5] = new int [30];
        diasDosMeses[6] = new int [31];
        diasDosMeses[7] = new int [31];
        diasDosMeses[8] = new int [30];
        diasDosMeses[9] = new int [31];
        diasDosMeses[10] = new int [30];
        diasDosMeses[11] = new int [31];

        for(int i = 0; i < diasDosMeses.length; i++){
            for(int j = 0; j < diasDosMeses[i].length; j++){
                diasDosMeses[i][j] = j + 1;
                System.out.println(diasDosMeses[i][j]);
            }
        }
    }
    }
