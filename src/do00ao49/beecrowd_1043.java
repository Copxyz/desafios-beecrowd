package do00ao49;

import java.util.Scanner;

public class beecrowd_1043 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a, b, c, perimetro, area;

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        scanner.close();

        if (a > 0 && b > 0 && c > 0) {

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                perimetro = a + b + c;
                System.out.printf("Perimetro = %.1f%n", perimetro);
            }
            else {
                area = (a + b) / 2 * c;
                System.out.printf("Area = %.1f%n", area);
            }
        }

    }
}
