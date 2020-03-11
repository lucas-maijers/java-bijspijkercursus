package h04;

import java.util.Arrays;
import java.util.Scanner;

public class op7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Land 1:");
        String l1 = input.nextLine();

        System.out.println("Land 2:");
        String l2 = input.nextLine();

        System.out.println("Land 3:");
        String l3 = input.nextLine();

        String[] landen = {l1.substring(0, 1).toUpperCase() + l1.substring(1), l2.substring(0, 1).toUpperCase() + l2.substring(1), l3.substring(0, 1).toUpperCase() + l3.substring(1)};

        Arrays.sort(landen);

        System.out.println(String.format("%s %s %s", landen[0], landen[1], landen[2]));
    }
}
