package h02;

import java.util.Scanner;

public class op3 {
    public static void main(String[] args) {
        Scanner startBedragInput = new Scanner(System.in);
        Scanner renteInput = new Scanner(System.in);

        System.out.println("Typ het startbedrag:");
        double startbedrag = startBedragInput.nextDouble();

        System.out.println("Typ het rentepercentage: ");
        double rentepercentage = renteInput.nextInt();

        double rente = rentepercentage / 100 * startbedrag;
        double totaal = rente + startbedrag;

        System.out.println("De rente is " + rente + " en het totaalbedrag is " + totaal);
    }
}
