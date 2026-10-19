package do50ao99;

import java.util.Scanner;

public class beecrowd_1094 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantia, n, i, totalCobaias;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        float percentCoelhos, percentRatos, percentSapos;
        char cobaia;

        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            quantia = scanner.nextInt();
            cobaia = scanner.next().charAt(0);

            if (quantia >= 1 && quantia <= 15) {

                if (cobaia == 'C') {
                    coelhos += quantia;
                }
                else if (cobaia == 'R') {
                    ratos += quantia;
                }
                else if (cobaia == 'S') {
                    sapos += quantia;
                }
            }
        }

        scanner.close();

        totalCobaias = coelhos + ratos + sapos;

        percentCoelhos = (float) coelhos / totalCobaias;
        percentRatos = (float) ratos / totalCobaias;
        percentSapos = (float) sapos / totalCobaias;

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", (percentCoelhos * 100));
        System.out.printf("Percentual de ratos: %.2f %%%n", (percentRatos * 100));
        System.out.printf("Percentual de sapos: %.2f %%%n", (percentSapos * 100));

    }

}
