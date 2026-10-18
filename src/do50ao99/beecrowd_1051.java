package do50ao99;

import java.util.Scanner;

public class beecrowd_1051 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float renda, imposto, auxiliar;
        float total = 0;

        renda = scanner.nextFloat();

        scanner.close();

        if (renda > 4500) {
            imposto = (float) 0.28;
            auxiliar = renda - 4500;
            total = auxiliar * imposto;
            renda -= auxiliar;
        }

        if (renda > 3000 && renda <= 4500) {
            imposto = (float) 0.18;
            auxiliar = renda - 3000;
            total += auxiliar * imposto;
            renda -= auxiliar;
        }

        if (renda > 2000 && renda <= 3000) {
            imposto = (float) 0.08;
            auxiliar = renda - 2000;
            total += auxiliar * imposto;
            System.out.printf("R$ %.2f%n", total);
        }

        if (renda >= 0 && renda <= 2000) {
            System.out.println("Isento");
        }

    }
}
