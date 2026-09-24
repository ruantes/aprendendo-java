package flamingo.aprendendo.Intermediario.test;
import flamingo.aprendendo.Intermediario.Dominio.Curso;
import java.util.Scanner;

public class CursoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso cs = new Curso();

        System.out.println("Digite a duração do curso");
        int duracao = sc.nextInt();
        cs.duracaoAnos = duracao;

        System.out.println("Digite o valor da mensalidade");
        double valorMensalidade = sc.nextDouble();
        cs.mensalidade = valorMensalidade;

        System.out.println("Digite a modalidade do seu curso (Presencial, Semi-Prensencial ou EAD)");
        String modeloCs = sc.nextLine();
        cs.modelo = modeloCs;

        System.out.println("Digite o período do curso (Matutino, Vespertino ou Noturno)");
        String turnoCs = sc.nextLine();
        cs.turno = turnoCs;
    }
    }
