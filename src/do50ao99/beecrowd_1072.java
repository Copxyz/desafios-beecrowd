package do50ao99;

import java.util.Scanner;

public class beecrowd_1072 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, valor, i;
        int in = 0;
        int out = 0;

        x = scanner.nextInt();

        for (i = 1; i <= x; i++) {
            valor = scanner.nextInt();

            if (valor >= 10 && valor <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        scanner.close();

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
