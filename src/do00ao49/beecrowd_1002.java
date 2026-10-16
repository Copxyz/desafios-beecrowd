package do00ao49;

import java.util.Scanner;

public class beecrowd_1002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio, area;
        double n = 3.14159;

        raio = scanner.nextDouble();

        area = Math.pow(raio, 2) * n;

        scanner.close();

        System.out.printf("A=%.4f%n", area);
    }

}
