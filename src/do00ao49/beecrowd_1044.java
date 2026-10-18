package do00ao49;

import java.util.Scanner;

public class beecrowd_1044 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        scanner.close();

        if ((a % b) == 0 || (b % a) == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
