package do100ao149;

import java.util.Scanner;

public class beecrowd_1149 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int n = scanner.nextInt();

        while (n <= 0) {

            n = scanner.nextInt();
        }

        scanner.close();

        int saida = a;

        int i;
        for (i = 1; i <= (n - 1); i++){

            saida += a + i;
        }

        System.out.println(saida);
    }
}
