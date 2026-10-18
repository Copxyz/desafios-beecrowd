package do00ao49;

import java.util.Scanner;

public class beecrowd_1047 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHoras, duracaoMinutos;
        int duracao;

        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();

        scanner.close();

        if (horaInicial >= horaFinal){
            duracao = 24 * 60 + horaFinal * 60 + minutoFinal - horaInicial * 60 - minutoInicial;
        }
        else {
            duracao = horaFinal * 60 + minutoFinal - horaInicial * 60 - minutoInicial;
        }

        duracaoHoras = duracao / 60;
        duracaoMinutos = duracao % 60;

        if (duracaoHoras == 24 && duracaoMinutos != 0) {
            duracaoHoras -= 24;
        }

        if (duracao == 0 && duracaoMinutos == 0) {
            duracaoHoras = 24;
        }

        if (duracaoMinutos >= 0 || duracaoHoras >= 1 && duracaoHoras <= 24) {
            System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        }

    }
}
