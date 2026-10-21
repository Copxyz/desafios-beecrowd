package do50ao99;

import java.util.Scanner;

public class beecrowd_1099 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, x, y, menor, maior, i, j;
        int somaImpares = 0;

        n = scanner.nextInt();

        for (i = 0; i < n; i++) {

            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x > y) {

                maior = x;
                menor = y;
            }
            else {

                maior = y;
                menor = x;
            }

            for (j = menor + 1; j < maior; j++) {

                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }

            System.out.println(somaImpares);
            somaImpares = 0;
        }

        scanner.close();
    }
}
