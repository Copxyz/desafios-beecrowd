package do100ao149;

import java.util.Scanner;

public class beecrowd_1132 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, min, max, i;
        int soma = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();

        scanner.close();

        if (x >= y) {
            max = x;
            min = y;
        }
        else {
            max = y;
            min = x;
        }

        for (i = min; i <= max; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

    }
}
