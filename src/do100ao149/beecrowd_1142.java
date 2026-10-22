package do100ao149;

import java.util.Scanner;

public class beecrowd_1142 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i;
        int numero = 0;

        n = scanner.nextInt();

        scanner.close();

        for (i = 1; i <= n; i++) {
            numero++;
            System.out.print(numero);
            numero++;
            System.out.print(" " + numero);
            numero++;
            System.out.println(" " + numero + " PUM");
            numero++;
        }

    }

}
