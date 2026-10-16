package do00ao49;

import java.util.Scanner;

public class beecrowd_1014 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distanciaPercorrida;
        float combustivelGasto, consumoMedio;

        distanciaPercorrida = scanner.nextInt();
        combustivelGasto = scanner.nextFloat();

        scanner.close();

        consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("%.3f km/l%n", consumoMedio);

    }
}
