package h04;

import java.util.Scanner;

public class op6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Typ een String:");
        String s = input.nextLine();

        System.out.println(String.format("De lengte van de String is %d", s.length()));
        System.out.println(String.format("Het eerste karakter is %s", s.charAt(0)));
        System.out.println(String.format("Het laatste karakter is %s", s.charAt(s.length() - 1)));
    }
}
