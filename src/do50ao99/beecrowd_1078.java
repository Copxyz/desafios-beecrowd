package do50ao99;

import java.util.Scanner;

public class beecrowd_1078 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i;

        n = scanner.nextInt();

        scanner.close();

        if (n > 2 && n < 1000) {
            for (i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }

    }

}
