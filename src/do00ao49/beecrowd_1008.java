package do00ao49;

import java.util.Scanner;

public class beecrowd_1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, horas;
        float valorHora, salario;

        numero = scanner.nextInt();
        horas = scanner.nextInt();
        valorHora = scanner.nextFloat();

        scanner.close();

        salario = horas * valorHora;

        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
