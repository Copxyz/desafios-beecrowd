package do100ao149;

import java.util.Scanner;

public class beecrowd_1133 {
    public static void main(String[] args) {

        int i, x, y, menor, maior;

        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > y) {

            maior = x;
            menor = y;
        }
        else {

            maior = y;
            menor = x;
        }

        for (i = menor + 1; i < maior; i++) {

            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

}
