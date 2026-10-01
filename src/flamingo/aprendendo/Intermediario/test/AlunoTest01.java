package flamingo.aprendendo.Intermediario.test;
import flamingo.aprendendo.Intermediario.Dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();

        aluno01.nome = "Camilly";
        aluno01.nota = 8.5;

        System.out.println("Aluno: " + aluno01.nome);
        System.out.println("Nota: " + aluno01.nota);
        System.out.println("Aprovado: " + aluno01.isAprovado());
        System.out.println("Convite: " + aluno01.verificarConvite());
    }
}
