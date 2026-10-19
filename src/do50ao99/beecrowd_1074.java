package do50ao99;

import java.util.Scanner;

public class beecrowd_1074 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, valor, i;

        x = scanner.nextInt();

        for (i = 1; i <= x; i++) {
            valor = scanner.nextInt();

            if (valor > 0) {

                if (valor % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                }
                else {
                    System.out.println("ODD POSITIVE");
                }
            }
            else if (valor < 0) {

                if (valor % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                }
                else {
                    System.out.println("ODD NEGATIVE");
                }
            }
            else {
                System.out.println("NULL");
            }
        }

        scanner.close();

    }
}
