package flamingo.aprendendo.Intermediario.Dominio;

public class ImpressoraCarro {
    public void imprime(Carro carro){

        System.out.println("Nome" + carro.nome);
        System.out.println("Marca" + carro.marca);
        System.out.println("Ano" + carro.ano);
        System.out.println("Velocidade" + carro.velocidadeAtual + "km/h");
        System.out.println("---------------------------------------");

    }
}
