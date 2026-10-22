package do100ao149;

import java.util.Scanner;

public class beecrowd_1131 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int golsGremio, golsInter;
        int vitoriasGremio = 0;
        int vitoriasInter = 0;
        int empates = 0;
        int grenais = 0;
        int opcao = 0;
        String mensagem;

        golsInter = scanner.nextInt();
        golsGremio = scanner.nextInt();

        while (opcao != 2) {
            grenais++;

            if (golsInter > golsGremio){
                vitoriasInter++;
            }
            else if (golsGremio > golsInter) {
                vitoriasGremio++;
            }
            else {
                empates++;
            }

            opcao = 0;

            while (opcao != 1 && opcao != 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                opcao = scanner.nextInt();
            }

            if (opcao == 1) {
                golsInter = scanner.nextInt();
                golsGremio = scanner.nextInt();
            }
        }

        scanner.close();

        if (vitoriasInter > vitoriasGremio) {
            mensagem = "Inter venceu mais";
        }
        else if (vitoriasGremio > vitoriasInter) {
            mensagem = "Gremio venceu mais";
        }
        else {
            mensagem = "Nao houve vencedor";
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        System.out.println(mensagem);

    }
}
