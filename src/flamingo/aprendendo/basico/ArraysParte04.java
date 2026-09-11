package flamingo.aprendendo.basico;

public class ArraysParte04 {
    static void main() {
        int i = 0, j = 0;
        int[][] numeros = new int[3][3];
        numeros[0][0] = 12;
        numeros[0][1] = 22;
        numeros[0][2] = 32;

        numeros[1][0] = 42;
        numeros[1][1] = 52;
        numeros[1][2] = 62;

        numeros[2][0] = 42;
        numeros[2][1] = 52;
        numeros[2][2] = 62;

        while(i < numeros.length){
            i++;
            while(j < numeros[i].length){
                j++;
            }
        }
    }
}
