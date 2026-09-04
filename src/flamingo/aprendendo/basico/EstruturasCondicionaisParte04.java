package flamingo.aprendendo.basico;
import java.util.Scanner;

public class EstruturasCondicionaisParte04 {
    public static void main(String[] args) {
        // Switch Case (Escolha o Lado)
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para escolher o dia da semana: ");
        byte diaDaSemana = sc.nextByte();
        String resultado;
        switch (diaDaSemana){
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sábado";
                break;
            default:
                resultado = "Dia inválido";
                break;
        }
        System.out.println(resultado);
        sc.close();
    }
}
