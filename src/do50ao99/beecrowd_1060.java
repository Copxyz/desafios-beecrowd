package do50ao99;

import java.util.Scanner;

public class beecrowd_1060 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a, b, c, d, e, f;
        int postivos = 0;

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        d = scanner.nextFloat();
        e = scanner.nextFloat();
        f = scanner.nextFloat();

        scanner.close();

        if (a > 0) {
            postivos++;
        }

        if (b > 0) {
            postivos++;
        }

        if (c > 0) {
            postivos++;
        }

        if (d > 0) {
            postivos++;
        }

        if (e > 0) {
            postivos++;
        }

        if (f > 0) {
            postivos++;
        }

        System.out.println(postivos + " valores positivos");

    }
}
