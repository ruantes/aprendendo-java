package flamingo.aprendendo.basico.revisaoarray;

public class ArraysParte4 {
    public static void main(String[] args) {
int [][] numeros = new int [3][3];
numeros [0][0] = 12;
        numeros [0][1] = 22;
        numeros [0][2] = 32;

        numeros [1][0] = 42;
        numeros [1][1] = 52;
        numeros [1][2] = 62;

        numeros [2][0] =71;
        numeros [2][1] = 91;
        numeros [2][2] = 81;

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros [i].length; j++){
                System.out.println(numeros[i][j]);
            }
        }


    }


}
