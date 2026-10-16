package do00ao49;

import java.util.Scanner;

public class beecrowd_1042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, z, a, b, c;

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        scanner.close();

        if (x <= y && x <= z) {
            a = x;

            if (y <= z) {
                b = y;
                c = z;
            }
            else {
                b = z;
                c = y;
            }
        }
        else if (y <= z) {
            a = y;

            if (z <= x) {
                b = z;
                c = x;
            }
            else {
                b = x;
                c = z;
            }
        }
        else {
            a = z;

            if (x <= y) {
                b = x;
                c = y;
            }
            else {
                b = y;
                c = x;
            }
        }

        System.out.println(a + "\n" + b + "\n" + c);
        System.out.println("\n" + x + "\n" + y + "\n" + z);

    }
}
