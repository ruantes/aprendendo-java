package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

        public static void main(String[] args) {
            //byte : -128 a 127
            //short : - 32.768 a 32.767
            // Int : -2 bilhoes a 2 bilhoes
            //Long : Para numeros inteiros muito grandes (usa um L no final do numero)
            //float : Precisão simples (usa um f no final,ex: 5.5f)
            // double: Precisão dupla,sendo o padrão para decimais no java
            //char:Guarda unica letra ou simbolo em formato Unicode(Ex: A)
            //Boolean: Guarda apenas dois valores:true (verdadeiro) ou false (falso)
            short idade = 130;
            int municipio = 2000000000;
            long contaBancaria = 999999999999999999L;
            float salario = 15000.66f;
            double salarioExtra = 25000.50;
            char primeiraLetraDoNome = 'R';
            boolean vaiEstudarNasFerias = false;
            System.out.println("Primeira letra do meu nome é:" + primeiraLetraDoNome);
            System.out.println("Pl caiu ="+ salarioExtra);
            System.out.println("Meu salario depois de estudar com bigas é"+ salario);
        System.out.println("Minha idade é" + idade);
        System.out.println("São Paulo(SP): Mais de" + municipio + "milhões de moradores");
        System.out.println ("Minha conta bancaria daqui a 5 anos"+ contaBancaria);
    }
}