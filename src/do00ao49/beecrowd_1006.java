package do00ao49;

import java.util.Scanner;

public class beecrowd_1006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A, B, C, media;
        int notaA = 2;
        int notaB = 3;
        int notaC = 5;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        scanner.close();

        A = A * notaA;
        B = B * notaB;
        C = C * notaC;

        media = (A + B + C) / (notaA + notaB + notaC);

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
