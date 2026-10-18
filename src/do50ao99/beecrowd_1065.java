package do50ao99;

import java.util.Scanner;

public class beecrowd_1065 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, e;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();

        scanner.close();

        if ((a % 2) == 0) {
            pares++;
        }
        else {
            impares++;
        }
        if (a > 0) {
            positivos++;
        }
        else if (a < 0){
            negativos++;
        }

        if ((b % 2) == 0) {
            pares++;
        }
        else {
            impares++;
        }
        if (b > 0) {
            positivos++;
        }
        else if (b < 0){
            negativos++;
        }

        if ((c % 2) == 0) {
            pares++;
        }
        else {
            impares++;
        }
        if (c > 0) {
            positivos++;
        }
        else if (c < 0){
            negativos++;
        }

        if ((d % 2) == 0) {
            pares++;}
        else {
            impares++;
        }
        if (d > 0) {
            positivos++;
        }
        else if (d < 0){
            negativos++;
        }

        if ((e % 2) == 0) {
            pares++;
        }
        else {
            impares++;
        }
        if (e > 0) {
            positivos++;
        }
        else if (e < 0){
            negativos++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}

