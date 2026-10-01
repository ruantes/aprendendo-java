package flamingo.aprendendo.Intermediario.test;
import flamingo.aprendendo.Intermediario.Dominio.SomaDoisNumeros;

public class SomaDoisNumerosTest01 {
    public static void main(String[] args) {
        SomaDoisNumeros somaDoisNumeros = new SomaDoisNumeros();

        int multiplica = somaDoisNumeros.somaDoisNumeros02(2,2) * 4;

        System.out.println(multiplica);
    }
}
