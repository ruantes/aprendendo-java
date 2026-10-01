package flamingo.aprendendo.Intermediario.test;
import  flamingo.aprendendo.Intermediario.Dominio.Carro;
import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro01 = new Carro();

        System.out.println("Digite a marca do carro: ");
        carro01.marca = sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
        carro01.nome = sc.nextLine();

        System.out.println("Digite a velocidade atual do carro: ");
        carro01.velocidadeAtual = sc.nextInt();

        System.out.println(carro01.verificarMulta(120));
    }
}
