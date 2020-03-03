package h02;

import java.util.Scanner;

public class op2 {
    public static void main(String[] args) {
        int jaar = 365;
        int dag = 24 * 60;

        Scanner jaarInput = new Scanner(System.in);
        Scanner maandInput = new Scanner(System.in);

        System.out.println("Hoeveel jaar oud ben je?");
        int inputJaar = jaarInput.nextInt();

        System.out.println("Hoeveel maanden komen daar nog bij?");
        int inputMaand = maandInput.nextInt();

        System.out.println(" ");
        System.out.println("Uitrekenen");

        for (int i = 0; i < 3; i++) {
            try {
                switch (i) {
                    case 0:
                        System.out.println(".");
                        break;
                    case 1:
                        System.out.println("..");
                        break;
                    case 2:
                        System.out.println("...");
                        break;
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int minutenOud = (inputJaar * jaar + (inputMaand * 30)) * dag;
        System.out.println("Dan ben je nu ongeveer " + minutenOud + " minuten oud");

    }
}
