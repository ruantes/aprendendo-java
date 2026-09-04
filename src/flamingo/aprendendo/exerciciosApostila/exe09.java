package flamingo.aprendendo.exerciciosApostila;

import java.util.Scanner;

public class exe09 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu salario mensal atual");
        int salario = sc.nextInt();
        int ajuste = salario ;
        System.out.println("seu salario ajustado é "+ ajuste);
        sc.close();
    }
}
