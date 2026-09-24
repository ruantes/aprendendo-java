package flamingo.aprendendo.Intermediario.test;
import flamingo.aprendendo.Intermediario.Dominio.Disciplina;
import java.util.Scanner;

public class DisciplinaTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        System.out.println("Digite o nome da disciplina");
        String disc = sc.nextLine();
        disciplina.nome = disc;

        System.out.println("Digite a carga horária do seu curso");
        int cargaHoraria = sc.nextInt();
        disciplina.cargaHoraria = cargaHoraria;

        System.out.println("Digite o nome do professor do curso");
        String nomeProfessor = sc.nextLine();
        disciplina.nomeProfessor = nomeProfessor;

        System.out.println("Digite o semestre atual em que o aluno está");
        int semestreAtual = sc.nextInt();
        disciplina.semestre = semestreAtual;

    }
}
