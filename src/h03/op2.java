package h03;

import java.util.Scanner;

public class op2 {

    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);

        Scanner input = new Scanner(System.in);

        System.out.println(String.format("Hoeveel is %d x %d x %d", random1, random2, random3));
        int getalInput = input.nextInt();

        if (getalInput == random1 * random2 * random3) {
            System.out.println("Helemaal goed!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
