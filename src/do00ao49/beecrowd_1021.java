package do00ao49;

import java.util.Scanner;

public class beecrowd_1021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float valor, resto;
        int nota2, nota5, nota10, nota20, nota50, nota100,
                moeda1cents, moeda5cents, moeda10cents, moeda25cents, moeda50cents, moeda1real;

        valor = scanner.nextFloat();

        scanner.close();

        nota100 = (int) valor / 100;
        resto = valor % 100;

        nota50 = (int) resto / 50;
        resto = resto % 50;

        nota20 = (int) resto / 20;
        resto = resto % 20;

        nota10 = (int) resto / 10;
        resto = resto % 10;

        nota5 = (int) resto / 5;
        resto = resto % 5;

        nota2 = (int) resto / 2;
        resto = resto % 2;

        moeda1real = (int) resto;
        resto = resto % 1;

        moeda50cents = (int) (resto / 0.5);
        resto = (float) (resto % 0.5);

        moeda25cents = (int) (resto / 0.25);
        resto = (float) (resto % 0.25);

        moeda10cents = (int) (resto / 0.1);
        resto = (float) (resto % 0.1);

        moeda5cents = (int) (resto / 0.05 + 0.001); //somando 0,001 para evitar problemas de arredondamento
        resto = (float) ((resto + 0.001) % 0.05); //somando 0,001 para evitar problemas de arredondamento

        moeda1cents = (int) (resto / 0.01 + 0.001); //somando 0,001 para evitar problemas de arredondamento

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda1real + " moeda(s) de R$ 1.00");
        System.out.println(moeda50cents + " moeda(s) de R$ 0.50");
        System.out.println(moeda25cents + " moeda(s) de R$ 0.25");
        System.out.println(moeda10cents + " moeda(s) de R$ 0.10");
        System.out.println(moeda5cents + " moeda(s) de R$ 0.05");
        System.out.println(moeda1cents + " moeda(s) de R$ 0.01");

    }

}
