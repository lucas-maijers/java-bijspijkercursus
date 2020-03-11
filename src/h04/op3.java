package h04;

import java.util.Scanner;
import java.util.stream.Stream;

public class op3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Van welk getal wil je weten of het een klinker is?");

        String s = input.next();

        if (Stream.of("a", "e", "i", "o", "u").anyMatch(s::equalsIgnoreCase)) {
            System.out.println(String.format("De %s is een klinker.", s));
        } else {
            System.out.println(String.format("De %s is een medeklinker.", s));
        }
    }
}
