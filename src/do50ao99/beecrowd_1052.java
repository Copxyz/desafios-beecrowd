package do50ao99;

import java.util.Scanner;

public class beecrowd_1052 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroMes;
        String mes;

        numeroMes = scanner.nextInt();

        scanner.close();

        switch (numeroMes) {
            case 1:
                mes = "January";
                break;

            case 2:
                mes = "February";
                break;

            case 3:
                mes = "March";
                break;

            case 4:
                mes = "April";
                break;

            case 5:
                mes = "May";
                break;

            case 6:
                mes = "June";
                break;

            case 7:
                mes = "July";
                break;

            case 8:
                mes = "August";
                break;

            case 9:
                mes = "September";
                break;

            case 10:
                mes = "October";
                break;

            case 11:
                mes = "November";
                break;

            case 12:
                mes = "December";
                break;

            default:
                mes = "";
                break;
        }

        System.out.println(mes);

    }
}
