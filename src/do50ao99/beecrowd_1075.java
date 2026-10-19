package do50ao99;

import java.util.Scanner;

public class beecrowd_1075 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, i;

        n = scanner.nextInt();

        if (n < 10000) {

            for (i = 1; i <= 10000; i++) {

                if (i % n == 2) {

                    System.out.println(i);
                }
            }
        }

        scanner.close();

    }
}
