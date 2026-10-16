package do00ao49;

import java.util.Scanner;

public class beecrowd_1015 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float x1, y1, x2, y2, distancia;

        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        scanner.close();

        distancia = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.printf("%.4f%n", distancia);

    }
}
