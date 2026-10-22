package do150ao199;

import java.util.Scanner;

public class beecrowd_1150 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, z;

        x = scanner.nextInt();

        do {

            z = scanner.nextInt();
        } while (z <= x);

        scanner.close();

        int contador = 1;
        int soma = x;
        while (soma <= z) {

            soma += (x + contador);
            contador++;
        }

        System.out.println(contador);
    }
}
