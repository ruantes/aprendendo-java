package flamingo.aprendendo.exerciciosApostila;

public class ExemploNomeCompleto {
    static void exibirNomeCompleto(String nome){
        System.out.println("O nome completo do paciente é: "+ nome + "Silva");
    }

    public static void main (String[]args){

        exibirNomeCompleto("Pedro");
        exibirNomeCompleto("Paulo");
        exibirNomeCompleto("Yago");

    }
}
