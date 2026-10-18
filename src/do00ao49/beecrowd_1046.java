package do00ao49;

import java.util.Scanner;

public class beecrowd_1046 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();

        scanner.close();

        if (horaInicial  >= horaFinal){
            duracao = 24 - horaInicial + horaFinal;
        }
        else {
            duracao = horaFinal - horaInicial;
        }

        if (duracao >= 1 && duracao <= 24) {
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }

    }
}
