package do100ao149;

import java.util.Scanner;

public class beecrowd_1144 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i, aoQuadrado, aoCubo;
        int numero = 0;

        n = scanner.nextInt();

        scanner.close();

        if (n > 1 && n < 1000) {

            for (i = 1; i <= n; i++) {
                numero += i;
                System.out.print(numero);
                aoQuadrado = (int) Math.pow(numero, 2);
                System.out.print(" " + aoQuadrado);
                aoCubo = (int) Math.pow(numero, 3);
                System.out.println(" " + aoCubo);

                System.out.print(numero);
                System.out.print(" " + (aoQuadrado + 1));
                System.out.println(" " + (aoCubo + 1));
                numero = 0;
            }
        }

    }
}
