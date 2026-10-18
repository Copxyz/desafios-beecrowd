package do00ao49;

import java.util.Scanner;

public class beecrowd_1048 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float salario, novoSalario, reajuste, percentual;

        salario = scanner.nextFloat();

        scanner.close();

        if (salario <= 400){
            percentual = 0.15f;
            reajuste = salario * percentual;
            novoSalario = salario + reajuste;
        }
        else if (salario <= 800){
            percentual = 0.12f;
            reajuste = salario * percentual;
            novoSalario = salario + reajuste;
        }
        else if (salario <= 1200){
            percentual = 0.1f;
            reajuste = salario * percentual;
            novoSalario = salario + reajuste;
        }
        else if (salario <= 2000){
            percentual = 0.07f;
            reajuste = salario * percentual;
            novoSalario = salario + reajuste;
        }
        else {
            percentual = 0.04f;
            reajuste = salario * percentual;
            novoSalario = salario + reajuste;
        }

        System.out.printf("Novo salario: %.2f", novoSalario);
        System.out.printf("%nReajuste ganho: %.2f", reajuste);
        System.out.printf("%nEm percentual: %.0f %%%n", 100 * percentual);

    }
}
