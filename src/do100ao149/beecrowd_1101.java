package do100ao149;

import java.util.Scanner;

public class beecrowd_1101 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m, n, i, maior, menor;
        int soma = 0;

        m = scanner.nextInt();
        n = scanner.nextInt();

        while (m > 0 && n > 0) {

            if (m >= n) {
                maior = m;
                menor = n;
            }
            else {
                maior = n;
                menor = m;
            }

            for (i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);
            soma = 0;

            m = scanner.nextInt();
            n = scanner.nextInt();
        }

        scanner.close();

    }
}
