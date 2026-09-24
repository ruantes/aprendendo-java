package flamingo.aprendendo.Intermediario.test;
import java.util.Scanner;
import flamingo.aprendendo.Intermediario.Dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.println("Digite o nome do professor");
        String nomeProfessor = sc.nextLine();
        professor.nome = nomeProfessor;

        System.out.println("Digite a idade do professor");
        int idade = sc.nextInt();
        professor.idade = idade;

        System.out.println("Digite a disciplina lecionada pelo professor");
        String disciplina = sc.nextLine();
        professor.disciplina = disciplina;

        System.out.println("Digite o salário do professor");
        double salarioProfessor = sc.nextDouble();
        professor.salario = salarioProfessor;
    }
}
