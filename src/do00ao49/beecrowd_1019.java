package do00ao49;

import java.util.Scanner;

public class beecrowd_1019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, segundos, minutos, horas;

        n = scanner.nextInt();

        scanner.close();

        horas = n / (60 * 60);
        minutos = (n - horas * 60 * 60) / 60;
        segundos = n - horas * 60 * 60 - minutos * 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
