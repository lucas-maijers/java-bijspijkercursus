package h02;

import java.util.Scanner;

public class op5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Typ een getal tussen 0 en 1000: ");
        int getalInput = input.nextInt();

        if (getalInput >= 1000 || getalInput <= 0) {
            System.out.println("Deze input is niet tussen de 0 en 1000");
            return;
        }

        int getal1 = getalInput / 100;
        getalInput -= getal1 * 100;
        int getal2 = getalInput / 10;
        getalInput -= getal2 * 10;
        int getal3 = getalInput;

        int som = getal1 * getal2 * getal3;

        System.out.println(getal1 + " x " + getal2 + " x " + getal3 + " = " + som);
    }
}
