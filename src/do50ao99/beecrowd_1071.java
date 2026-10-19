package do50ao99;

import java.util.Scanner;

public class beecrowd_1071 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, i;
        int soma = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();

        scanner.close();

        for (i = (x + 1); i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        for (i = (y + 1); i < x; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

    }
}
