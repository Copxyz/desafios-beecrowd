package do100ao149;

import java.util.Scanner;

public class beecrowd_1146 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, i;

        x = scanner.nextInt();

        while (x != 0) {

            for (i = 1; i < x; i++) {
                System.out.print(i + " ");
            }

            System.out.println(x);

            x = scanner.nextInt();
        }

        scanner.close();

    }
}
