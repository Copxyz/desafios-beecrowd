package do100ao149;

import java.util.Scanner;

public class beecrowd_1113 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        while (x != y) {

            if (x > y) {
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }

            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        scanner.close();

    }
}
