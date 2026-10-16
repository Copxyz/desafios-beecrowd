package do00ao49;

import java.util.Scanner;

public class beecrowd_1016 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float veloCarroX = 60;
        float veloCarroY = 90;
        int distanciaYaoX, tempoParaDistancia;

        distanciaYaoX = scanner.nextInt();

        scanner.close();

        tempoParaDistancia = distanciaYaoX * ((int)(veloCarroY / veloCarroX + 0.5));

        System.out.println(tempoParaDistancia + " minutos");

    }

}
