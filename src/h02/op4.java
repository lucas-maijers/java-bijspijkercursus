package h02;

import java.util.Scanner;

public class op4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Typ een getal tussen 10 en 100: ");
        int getalInput = input.nextInt();

        int getal1, getal2, getal3, getal4;
        getal1 = getalInput - 2;
        getal2 = getalInput - 1;
        getal3 = getalInput + 1;
        getal4 = getalInput + 2;

        System.out.println("De vijf getallen zijn: " + getal1 + " - " + getal2 + " - " + getalInput + " - " + getal3+ " - " + getal4);
    }
}
