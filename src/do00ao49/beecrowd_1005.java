package do00ao49;

import java.util.Scanner;

public class beecrowd_1005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A, B, media;
        double notaA = 3.5;
        double notaB = 7.5;

        A = scanner.nextDouble();
        B = scanner.nextDouble();

        scanner.close();

        A = A * notaA;
        B = B * notaB;

        media = (A + B) / (notaA + notaB);

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
