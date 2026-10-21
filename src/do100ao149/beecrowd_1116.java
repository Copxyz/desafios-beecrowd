package do100ao149;

import java.util.Scanner;

public class beecrowd_1116 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, i;
        float valor1, valor2;

        x = scanner.nextInt();

        for (i = 1; i <= x; i++) {
            valor1 = scanner.nextFloat();
            valor2 = scanner.nextFloat();

            if (valor2 == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                System.out.printf("%.1f%n", (valor1/valor2));
            }
        }

        scanner.close();

    }
}
