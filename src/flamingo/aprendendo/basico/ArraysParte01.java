package flamingo.aprendendo.basico;

public class ArraysParte01 {
    public static void main(String[] args) {
        int [] idades = new int [4];
        int contador = 0;
        idades [0] =12;
        idades [1] =21;
        idades [2] =23;
        idades [3] =51;
         for(int i = 0; i <= idades.length; i++){
             System.out.println("Pessoa: " + i + " Idade: " + idades[i] + " anos");
         }
    }
}
