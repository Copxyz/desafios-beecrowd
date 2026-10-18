package do50ao99;

import java.util.Scanner;

public class beecrowd_1064 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a, b, c, d, e, f, media;
        float somatorio = 0;
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
            somatorio += a;
        }

        if (b > 0) {
            postivos++;
            somatorio += b;
        }

        if (c > 0) {
            postivos++;
            somatorio += c;
        }

        if (d > 0) {
            postivos++;
            somatorio += d;
        }

        if (e > 0) {
            postivos++;
            somatorio += e;
        }

        if (f > 0) {
            postivos++;
            somatorio += f;
        }

        System.out.println(postivos + " valores positivos");

        if(postivos == 0){
            postivos = 1;
        }

        media = somatorio / postivos;

        System.out.printf("%.1f%n", media);

    }
}
