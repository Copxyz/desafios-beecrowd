package do50ao99;

import java.util.Scanner;

public class beecrowd_1061 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int diaInicio, horasInicio, minutosInicio, segundosInicio,
                diaTermino, horasTermino, minutosTermino, segundosTermino,
                dias, horas, minutos, segundos, duracao, resto;

        scanner.next();
        diaInicio = scanner.nextInt();

        horasInicio = scanner.nextInt();
        scanner.next();
        minutosInicio = scanner.nextInt();
        scanner.next();
        segundosInicio = scanner.nextInt();

        scanner.next();
        diaTermino = scanner.nextInt();

        horasTermino = scanner.nextInt();
        scanner.next();
        minutosTermino = scanner.nextInt();
        scanner.next();
        segundosTermino = scanner.nextInt();

        scanner.close();

        duracao = (diaTermino * 24 * 60 * 60 + horasTermino * 60 * 60 + minutosTermino * 60 + segundosTermino)
                - (diaInicio * 24 * 60 * 60 + horasInicio * 60 * 60 + minutosInicio * 60 + segundosInicio);

        dias = duracao / (24 * 60 * 60);
        resto = duracao % (24 * 60 * 60);

        horas = resto / (60 * 60);
        resto = resto % (60 * 60);

        minutos = resto / 60;
        resto = resto % 60;

        segundos = resto;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

    }
}
