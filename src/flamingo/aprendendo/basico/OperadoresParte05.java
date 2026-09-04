package flamingo.aprendendo.basico;

public class OperadoresParte05 {
    public static void main(String[] args){
        // Operadores de Atribuição

        /*
        * = atribuição simples
        * += soma e atribui
        * -= subtrai e atribui
        * *= multiplica e atribui
        * /= divide e atribui
        * %= resto da divisão e atribuição
         */

        double totalCompra = 0;

        totalCompra += 50;
        totalCompra += 100;
        totalCompra += 50;

        totalCompra /= 2;

        System.out.printf("Total da compra = %.2f", totalCompra);
    }
}