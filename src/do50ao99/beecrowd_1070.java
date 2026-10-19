package do50ao99;

import java.util.Scanner;

public class beecrowd_1070 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;

        x = scanner.nextInt();

        if (x > 0) {

            if ((x % 2) != 0) {
                System.out.println(x);
            }
            else {
                System.out.println(x + 1);
                x++;
            }

            System.out.println(x + 2);
            System.out.println(x + 4);
            System.out.println(x + 6);
            System.out.println(x + 8);
            System.out.println(x + 10);
        }

    }
}
