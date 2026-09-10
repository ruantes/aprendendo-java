package flamingo.aprendendo.basico;

public class ArraysParte02 {
    public static void main(String[] args) {
        int i = 0;
        String[] nomes = new String[4];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naruto";
        nomes[3] = "Ichigo";

        while(i < nomes.length){
            System.out.println(nomes[i]);
            i++;
        }
    }
}
