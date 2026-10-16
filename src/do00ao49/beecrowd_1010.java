package do00ao49;

import java.util.Scanner;

public class beecrowd_1010 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorPeca1, valorPeca2, totalPagar;

        codigoPeca1 = scanner.nextInt();
        quantidadePeca1 = scanner.nextInt();
        valorPeca1 = scanner.nextDouble();

        codigoPeca2 = scanner.nextInt();
        quantidadePeca2 = scanner.nextInt();
        valorPeca2 = scanner.nextDouble();

        scanner.close();

        totalPagar = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);

    }
}
