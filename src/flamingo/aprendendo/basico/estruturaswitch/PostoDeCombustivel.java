package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;

public class PostoDeCombustivel {
    public static void main(String[] args) {
        byte tipoCombustivel;
        double litros, preco;
        String precoTotal = "";
        Scanner sc = new Scanner(System.in);
        System.out.printf("""
                Qual é o tipo de combustível?
                
                1) Gasolina - R$ 5,89 litro
                2) Etanol - R$ 3,99 litro
                3) Diesel - R$ 6,19 litro
                """);

        tipoCombustivel = sc.nextByte();

        switch (tipoCombustivel){
            case 1:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();
                preco = litros * 5.89;

                precoTotal = String.format("Preço total do combustível é R$%.2f", preco);
                break;

            case 2:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();
                preco = litros * 3.99;

                precoTotal = String.format("Preço total do combustível é R$%.2f", preco);
                break;

            case 3:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();
                preco = litros * 6.19;

                precoTotal = String.format("Preço total do combustível é R$%.2f", preco);
                break;

            default:
                precoTotal = "Não existe esta opção";
                break;
        }
        sc.close();
        System.out.println(precoTotal);
        }
    }
