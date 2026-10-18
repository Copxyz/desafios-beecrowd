package do00ao49;

import java.util.Scanner;

public class beecrowd_1049 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String caracteristica1, caracteristica2, caracteristica3;
        String animal = "";

        caracteristica1 = scanner.nextLine();
        caracteristica2 = scanner.nextLine();
        caracteristica3 = scanner.nextLine();

        scanner.close();

        if (caracteristica1.equals("vertebrado")) {

            if (caracteristica2.equals("ave")){

                if (caracteristica3.equals("carnivoro")) {
                    animal = "aguia";
                }
                else if (caracteristica3.equals("onivoro")) {
                    animal = "pomba";
                }
            }
            else if (caracteristica2.equals("mamifero")){

                if (caracteristica3.equals("onivoro")) {
                    animal = "homem";
                }
                else if (caracteristica3.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        }
        else if (caracteristica1.equals("invertebrado")) {

            if (caracteristica2.equals("inseto")){

                if (caracteristica3.equals("hematofago")) {
                    animal = "pulga";
                }
                else if (caracteristica3.equals("herbivoro")) {
                    animal = "lagarta";
                }
            }
            else if (caracteristica2.equals("anelideo")){

                if (caracteristica3.equals("hematofago")) {
                    animal = "sanguessuga";
                }
                else if (caracteristica3.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);

    }
}

