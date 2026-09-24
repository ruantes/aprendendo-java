package flamingo.aprendendo.Intermediario.test;
import flamingo.aprendendo.Intermediario.Dominio.Estudante;
import java.util.Scanner;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("Digite a idade do estudante");
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("Digite o RG do estudante");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("Digite o telefone do estudante");
        String telefone = sc.nextLine();
        estudante.tel = telefone;

        System.out.println("Digite o curso do estudante");
        String curso = sc.nextLine();
        estudante.curso = curso;

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.rg);
        System.out.println(estudante.tel);
        System.out.println(estudante.curso);


    }
}
