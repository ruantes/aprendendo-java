package flamingo.aprendendo.listapoo.test;
import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Camilly";
        conta.numeroConta = "123456-7";
        conta.saldo = 2000;

        System.out.printf("""
                Titular: %s
                Número da Conta: %s
                Saldo: R$ %.2f
                """, conta.titular, conta.numeroConta, conta.saldo);
    }
}
