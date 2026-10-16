package do00ao49;

import java.util.Scanner;

public class beecrowd_1017 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tempoGasto, veloMedia;
        int autonomia = 12;
        float litrosNecessarios;

        tempoGasto = scanner.nextInt();
        veloMedia = scanner.nextInt();

        scanner.close();

        litrosNecessarios = (tempoGasto * veloMedia / (float)autonomia);

        System.out.printf("%.3f%n", litrosNecessarios);
    }
}
