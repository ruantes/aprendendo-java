package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;

public class CardapioDeLanchonete{
    public static void main(String[] args) {
        int opcaoLanche;
        int quantidade;
        double valorPedido;
        String pedidoFinal = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Digite qual lanche você deseja:
                
                1) Hamburguer - R$ 25,00
                2) Pizza - R$ 40,00
                3) Batata frita - R$ 18,00
                4) Refrigerante - R$ 8,00
                5) Suco - R$ 10,00
                """);

        opcaoLanche = sc.nextInt();

        switch (opcaoLanche){
            case 1:
                System.out.println("Quantos você deseja?");
                quantidade = sc.nextInt();
                valorPedido = quantidade * 25;

                pedidoFinal = String.format("Preço total do pedido é R$%.2f", valorPedido);
                break;

            case 2:
                System.out.println("Quantos você deseja?");
                quantidade = sc.nextInt();
                valorPedido = quantidade * 40;

                pedidoFinal = String.format("Preço total do pedido é R$%.2f", valorPedido);
                break;

            case 3:
                System.out.println("Quantos você deseja?");
                quantidade = sc.nextInt();
                valorPedido = quantidade * 18;

                pedidoFinal = String.format("Preço total do pedido é R$%.2f", valorPedido);
                break;

            case 4:
                System.out.println("Quantos você deseja?");
                quantidade = sc.nextInt();
                valorPedido = quantidade * 8;

                pedidoFinal = String.format("Preço total do pedido é R$%.2f", valorPedido);
                break;

            case 5:
                System.out.println("Quantos você deseja?");
                quantidade = sc.nextInt();
                valorPedido = quantidade * 10;

                pedidoFinal = String.format("Preço total do pedido é R$%.2f", valorPedido);
                break;

            default:
                pedidoFinal = "Produto inválido";
        }
        sc.close();
        System.out.println(pedidoFinal);
    }
}