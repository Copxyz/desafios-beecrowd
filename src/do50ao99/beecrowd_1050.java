package do50ao99;

import java.util.Scanner;

public class beecrowd_1050 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ddd;
        String cidade;

        ddd = scanner.nextInt();

        scanner.close();

        switch (ddd) {
            case 61:
                cidade = "Brasilia";
                break;

            case 71:
                cidade = "Salvador";
                break;

            case 11:
                cidade = "Sao Paulo";
                break;

            case 21:
                cidade = "Rio de Janeiro";
                break;

            case 32:
                cidade = "Juiz de Fora";
                break;

            case 19:
                cidade = "Campinas";
                break;

            case 27:
                cidade = "Vitoria";
                break;

            case 31:
                cidade = "Belo Horizonte";
                break;

            default:
                cidade = "DDD nao cadastrado";
                break;
        }

        System.out.println(cidade);

    }
}
