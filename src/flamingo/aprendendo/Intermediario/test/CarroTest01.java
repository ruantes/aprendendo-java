package flamingo.aprendendo.Intermediario.test;
import  flamingo.aprendendo.Intermediario.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 1999;

        carro2.nome = "Gol";
        carro2.marca = "Volkswagen";
        carro2.ano = 2015;

        System.out.printf(""" 
                Carro 01
                nome: %s
                marca:%s
                ano: %d
                
                ---------------------
                Carro 02
                nome: %s
                marca:%s
                ano: %d
                
                """,carro1.nome, carro1.marca, carro1.ano,carro2.nome,carro2.marca, carro2.ano);

    }
}
