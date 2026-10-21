package do100ao149;

import java.util.Scanner;

public class beecrowd_1114 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tentativa;
        int senha = 2002;

        tentativa = scanner.nextInt();

        while (tentativa != senha) {
            System.out.println("Senha Invalida");
            tentativa = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Acesso Permitido");

    }
}
