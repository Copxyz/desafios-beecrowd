package do00ao49;

import java.util.Scanner;

public class beecrowd_1013 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, maiorAB, maiorXC;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        scanner.close();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maiorXC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorXC + " eh o maior");

    }
}
