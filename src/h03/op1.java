package h03;

import java.util.Scanner;

public class op1 {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        Scanner input = new Scanner(System.in);

        System.out.println("Hoeveel is " + random1 +  " + " + random2 + "?");
        int inputGetal = input.nextInt();

        if (inputGetal == random1 + random2) {
            System.out.println("Klopt!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
