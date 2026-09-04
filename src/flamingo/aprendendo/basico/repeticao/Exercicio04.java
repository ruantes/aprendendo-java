package flamingo.aprendendo.basico.repeticao;

public class Exercicio04 {
    public static void main(String[] args) {
        int contador = 0;
        int soma = 0;

        for(int numero = 1; numero <= 100; numero++){
            soma = soma + numero;
            System.out.println(soma);
        }
    }
}
