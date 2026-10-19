package do50ao99;

import java.util.Scanner;

public class beecrowd_1067 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, i;

        x = scanner.nextInt();

        scanner.close();

        if (x >= 1 && x <= 1000) {
            for (i = 1; i <= x; i = i + 2) {
                System.out.println(i);
            }
        }

    }
}
