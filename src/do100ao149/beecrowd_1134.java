package do100ao149;

import java.util.Scanner;

public class beecrowd_1134 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int fim = 0;

        opcao = scanner.nextInt();

        while (fim != 1) {

            switch (opcao) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    fim = 1;
                    break;
                default:
                    break;
            }

            if (fim != 1) {
                opcao = scanner.nextInt();
            }
        }

        scanner.close();

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
