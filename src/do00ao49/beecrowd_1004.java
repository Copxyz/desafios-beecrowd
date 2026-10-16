package do00ao49;

import java.util.Scanner;

public class beecrowd_1004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A, B, PROD;

        A = scanner.nextInt();
        B = scanner.nextInt();

        scanner.close();

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}
