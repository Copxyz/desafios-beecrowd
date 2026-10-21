package do100ao149;

import java.util.Scanner;

public class beecrowd_1117 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, media;

        nota1 = scanner.nextFloat();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = scanner.nextFloat();
        }

        nota2 = scanner.nextFloat();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = scanner.nextFloat();
        }

        scanner.close();

        media = (nota1 + nota2) / 2;

        System.out.printf("media = %.2f%n", media);

    }
}
