package do50ao99;

import java.util.Scanner;

public class beecrowd_1079 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, i;
        float valor1, valor2, valor3, media;

        x = scanner.nextInt();

        for (i = 1; i <= x; i++) {
            valor1 = scanner.nextFloat();
            valor2 = scanner.nextFloat();
            valor3 = scanner.nextFloat();

            media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        scanner.close();

    }
}
