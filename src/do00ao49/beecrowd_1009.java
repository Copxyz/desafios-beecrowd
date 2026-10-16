package do00ao49;

import java.util.Scanner;

public class beecrowd_1009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeVendedor;
        double salario, vendas, comissao, total;

        nomeVendedor = scanner.next();
        salario = scanner.nextDouble();
        vendas = scanner.nextDouble();

        scanner.close();

        comissao = vendas * 0.15;
        total = comissao + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);

    }
}
