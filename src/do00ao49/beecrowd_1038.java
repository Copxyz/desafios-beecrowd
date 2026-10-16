package do00ao49;

import java.util.Scanner;

public class beecrowd_1038 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo, quantidade;
        float total;

        codigo = scanner.nextInt();
        quantidade = scanner.nextInt();

        scanner.close();

        switch (codigo) {
            case 1:
                total = quantidade * 4;
                break;
            case 2:
                total = (float) (quantidade * 4.5);
                break;
            case 3:
                total = quantidade * 5;
                break;
            case 4:
                total = quantidade * 2;
                break;
            case 5:
                total = (float) (quantidade * 1.5);
                break;
            default:
                total = 0;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", total);

    }

}
