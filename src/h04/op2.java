package h04;

import java.util.Scanner;

public class op2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");

        String s = input.next();

        if (Character.isDigit(s.charAt(0))) {
            System.out.println(String.format("De %s is een getal.", s));
        } else if (Character.isLetter(s.charAt(0))) {
            System.out.println(String.format("De %s is een letter.", s));
        } else {
            System.out.println(String.format("De %s is geen letter on ook geen getal.", s));
        }

    }
}
