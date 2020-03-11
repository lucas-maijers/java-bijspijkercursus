package h04;

import java.util.Scanner;

public class op1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Van welk karakter wil je de ASCII waarde weten?");
        char c = input.next().charAt(0);

        System.out.println((int) c);
    }
}
