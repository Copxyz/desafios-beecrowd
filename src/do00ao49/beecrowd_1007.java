package do00ao49;

import java.util.Scanner;

public class beecrowd_1007 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        scanner.close();

        diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);
    }
}
