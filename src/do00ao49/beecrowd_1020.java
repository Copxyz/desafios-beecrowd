package do00ao49;

import java.util.Scanner;

public class beecrowd_1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idadeEmDias, dias, meses, anos, resto;

        idadeEmDias = scanner.nextInt();

        scanner.close();

        anos = idadeEmDias / 365;
        resto = idadeEmDias % 365;

        meses = resto / 30;
        resto = resto % 30;

        dias = resto;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}
