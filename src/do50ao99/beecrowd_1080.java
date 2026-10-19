package do50ao99;

import java.util.Scanner;

public class beecrowd_1080 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor, maior, i;
        int posicao = 1;

        valor = scanner.nextInt();

        maior = valor;

        for (i = 2; i <= 100; i++) {
            valor = scanner.nextInt();

            if (valor > maior) {
                maior = valor;
                posicao = i;
            }

        }

        scanner.close();

        System.out.println(maior);
        System.out.println(posicao);

    }
}
