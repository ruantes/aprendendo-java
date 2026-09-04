package flamingo.aprendendo.basico.repeticao;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int quantidadeVendas;
        double valorVenda = 50, faturamento;
        String relatorio = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vendas você fez?");
        quantidadeVendas = sc.nextInt();

        for(int i = 0; i < quantidadeVendas; i++){
            faturamento = i * valorVenda;
            relatorio = String.format("""
                    Quantidade de vendas: %d
                    Faturamento: R$ %.2f
                    """, quantidadeVendas, faturamento);
        }
        System.out.println(relatorio);
    }
}
