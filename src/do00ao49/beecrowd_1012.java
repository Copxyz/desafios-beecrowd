package do00ao49;

import java.util.Scanner;

public class beecrowd_1012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        scanner.close();

        areaTriangulo = a * c / 2;
        areaCirculo = Math.pow(c, 2) * pi;
        areaTrapezio = (a + b) * c / 2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f", areaTriangulo);
        System.out.printf("%nCIRCULO: %.3f", areaCirculo);
        System.out.printf("%nTRAPEZIO: %.3f", areaTrapezio);
        System.out.printf("%nQUADRADO: %.3f", areaQuadrado);
        System.out.printf("%nRETANGULO: %.3f%n", areaRetangulo);

    }
}
