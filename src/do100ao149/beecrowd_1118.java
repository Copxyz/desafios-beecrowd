package do100ao149;

import java.util.Scanner;

public class beecrowd_1118 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, media;
        int opcao = 0;

        while (opcao != 2) {

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

            media = (nota1 + nota2) / 2;

            System.out.printf("media = %.2f%n", media);

            opcao = 0;

            while (opcao < 1 || opcao > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = scanner.nextInt();
            }
        }

        scanner.close();

    }
}
