package do00ao49;

import java.util.Scanner;

public class beecrowd_1011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double raio, volume;

        raio = scanner.nextDouble();

        scanner.close();

        volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

    }
}
