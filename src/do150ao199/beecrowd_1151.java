package do150ao199;

import java.util.Scanner;

public class beecrowd_1151 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int i;
        int atual = 0;
        int anterior = 0;
        int anteriorDoAnterior;
        for (i = 0; i < n; i++) {

            if (i == 0) {
                System.out.print(atual);
            }
            else {
                System.out.print(" " + atual);
            }

            if (i >= 1) {
                anteriorDoAnterior = anterior;
                anterior = atual;
                atual = anteriorDoAnterior + anterior;
            }
            else {
                anterior = atual;
                atual = 1;
            }

        }

        System.out.println();

    }
}
