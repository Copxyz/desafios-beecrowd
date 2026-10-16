package do00ao49;

import java.util.Scanner;

public class beecrowd_1040 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, n4, media;
        String status = "em exame.";

        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        n4 = scanner.nextFloat();

        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;

        if (media >= 7){
            status = "aprovado.";
        }
        else if (media < 5){
            status = "reprovado.";
        }

        System.out.printf("Media: %.1f", media);
        System.out.println("\nAluno " + status);

        if (media >= 5 && media < 7){
            float notaExame;
            notaExame = scanner.nextFloat();
            media = (media + notaExame) / 2;

            System.out.printf("Nota do exame: %.1f", notaExame);

            if (media >= 5){
                status = "aprovado.";
            }
            else{
                status = "reprovado.";
            }

            System.out.println("\nAluno " + status);
            System.out.printf("Media final: %.1f%n", media);
        }

        scanner.close();

    }
}
