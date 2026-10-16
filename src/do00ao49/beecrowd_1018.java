package do00ao49;

import java.util.Scanner;

public class beecrowd_1018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor, cedula1, cedula2, cedula5, cedula10, cedula20, cedula50, cedula100, resto;

        valor = scanner.nextInt();

        scanner.close();

        cedula100 = valor / 100;
        resto = valor % 100;

        cedula50 = resto / 50;
        resto = resto % 50;

        cedula20 = resto / 20;
        resto = resto % 20;

        cedula10 = resto / 10;
        resto = resto % 10;

        cedula5 = resto / 5;
        resto = resto % 5;

        cedula2 = resto / 2;
        resto = resto % 2;

        cedula1 = resto;

        System.out.println(valor + "\n" + cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 2,00");
        System.out.println(cedula1 + " nota(s) de R$ 1,00");

    }
}
