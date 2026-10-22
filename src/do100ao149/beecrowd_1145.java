package do100ao149;

import java.util.Scanner;

public class beecrowd_1145 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, i;
        int prints = 1;
        int numero = 1;

        x = scanner.nextInt();
        y = scanner.nextInt();

        scanner.close();

        if (x > 1 && x < 20 && x < y && y < 100000) {

            for (i = 1; i <= y; i++) {
                while (prints < x && numero < y) {
                    System.out.print(numero + " ");
                    numero++;
                    i++;
                    prints++;
                }
                prints = 1;
                System.out.println(numero);
                numero++;
            }
        }

    }
}
