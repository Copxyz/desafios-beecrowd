package do00ao49;

import java.util.Scanner;

public class beecrowd_1041 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float x, y;
        String posicao = "";

        x = scanner.nextFloat();
        y = scanner.nextFloat();

        scanner.close();

        if (x > 0 && y != 0) {
            if (y > 0){
                posicao = "Q1";
            }
            else if (y < 0){
                posicao = "Q4";
            }
        }
        else if (x < 0 && y != 0) {
            if (y > 0){
                posicao = "Q2";
            }
            else if (y < 0){
                posicao = "Q3";
            }
        }
        else if (y == 0){
            if (x == 0){
                posicao = "Origem";
            }
            else {
                posicao = "Eixo X";
            }
        }
        else {
            posicao = "Eixo Y";
        }

        System.out.println(posicao);

    }
}
