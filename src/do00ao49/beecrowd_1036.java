package do00ao49;

import java.util.Scanner;

public class beecrowd_1036 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a, b, c, delta, denominador, x1, x2;

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        scanner.close();

        delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }
        else {
            denominador = 2 * a;
            x1 = (float) ((-(b) + Math.sqrt(delta)) / denominador);
            x2 = (float) ((-(b) - Math.sqrt(delta)) / denominador);

            System.out.printf("R1 = %.5f", x1);
            System.out.printf("%nR2 = %.5f%n", x2);
        }

    }
}
