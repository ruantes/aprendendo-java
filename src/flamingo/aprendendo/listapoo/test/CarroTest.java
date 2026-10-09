package flamingo.aprendendo.listapoo.test;
import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Uno";
        carro.modelo = "Uno De Escada";
        carro.ano = 1990;

        System.out.printf("""
                Nome do Carro: %s
                Modelo do Carro: %s
                Ano de Fabricação: %d
                """, carro.nome, carro.modelo, carro.ano);
    }
}
