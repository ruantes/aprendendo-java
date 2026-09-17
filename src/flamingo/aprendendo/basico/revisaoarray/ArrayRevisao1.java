package flamingo.aprendendo.basico.revisaoarray;

public class ArrayRevisao1 {


    public static void main(String[] args) {
        int [] numeros = new int[4];
        numeros[0] = 21;
        numeros[1] = 23;
        numeros[2] = 47;
        numeros[3] = 67;

       for (int i = 0; i <4; i++){
        System.out.println("indice" + numeros + " - " + numeros[i]);
    }
}
}
