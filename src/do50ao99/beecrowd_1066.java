package do50ao99;

    import java.util.Scanner;

    public class beecrowd_1066 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int pares, impares, positivos, negativos;

            pares = impares = positivos = negativos = 0;

            for (int i = 0; i < 5; i++) {

                int valor = scanner.nextInt();

                if (valor > 0) {

                    positivos++;
                }
                else if (valor < 0){

                    negativos++;
                }

                if (valor % 2 == 0) {

                    pares++;
                }
                else {

                    impares++;
                }

            }

            scanner.close();

            System.out.print(pares + " valor(es) par(es)\n");
            System.out.print(impares + " valor(es) impar(es)\n");
            System.out.print(positivos + " valor(es) positivo(s)\n");
            System.out.print(negativos + " valor(es) negativo(s)\n");

        }
    }
