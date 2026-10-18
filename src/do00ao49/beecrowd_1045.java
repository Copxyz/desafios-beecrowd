package do00ao49;

import java.util.Scanner;

public class beecrowd_1045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c, x, y, z;

        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();

        scanner.close();

        if (x >= y && x >= z) {
            a = x;
            b = y;
            c = z;
        }
        else if (y >= z) {
            a = y;
            b = x;
            c = z;
        }
        else {
            a = z;
            b = y;
            c = x;
        }

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if ((a * a) == ((b * b) + (c * c))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        else if ((a * a) > ((b * b) + (c * c))) {
            System.out.println("TRIANGULO OBTUSANGULO");

            if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        else if ((a * a) < ((b * b) + (c * c))) {
            System.out.println("TRIANGULO ACUTANGULO");

            if (a == b && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}
