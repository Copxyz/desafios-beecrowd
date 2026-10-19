package do50ao99;

import java.util.Scanner;

public class beecrowd_1073 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        for (int i = 2; i <= n; i += 2) {

            System.out.println(i + "^" + 2 + " = " + i*i);
        }

    }
}
