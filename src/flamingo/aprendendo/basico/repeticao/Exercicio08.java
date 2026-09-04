package flamingo.aprendendo.basico.repeticao;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int quantidadeProduto, valorCompra = 0, valorProduto = 20;
        String carrinhoCompra = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        quantidadeProduto = sc.nextInt();

    for(int i = 0; i < quantidadeProduto; i++){
        valorCompra = quantidadeProduto * valorProduto;
        carrinhoCompra = String.format("""
                Quantidade de produtos: %d
                Preço total: R$ %d
                """, quantidadeProduto, valorCompra);
    }
        System.out.println(carrinhoCompra);
    }
}
