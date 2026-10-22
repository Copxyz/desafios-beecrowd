package do100ao149;

import java.util.Scanner;

public class beecrowd_1143 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i;
        int numero = 0;

        n = scanner.nextInt();

        scanner.close();

        if (n > 1 && n < 1000) {

            for (i = 1; i <= n; i++) {
                numero += i;
                System.out.print(numero);
                numero = numero * numero;
                System.out.print(" " + numero);
                numero = 0;
                numero += i;
                numero = numero * numero * numero;
                System.out.println(" " + numero);
                numero = 0;
            }
        }

    }
}
