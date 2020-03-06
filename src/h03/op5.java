package h03;

import java.util.Scanner;

public class op5 {
    public static void main(String[] args) {
        String bmiString = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Wat is uw gewicht? (kg)");
        int kg = input.nextInt();

        System.out.println("Wat is uw lengte? (m)");
        double m = input.nextDouble();

        double bmiRekenen = kg / (m * m);

        if (bmiRekenen < 18.5) {
            bmiString = "Ondergewicht hebt";
        } else if (bmiRekenen >= 18.5 && bmiRekenen < 25) {
            bmiString = "Normaal bent";
        } else if (bmiRekenen >= 25 && bmiRekenen < 30) {
            bmiString = "Overgewicht hebt";
        } else {
            bmiString = "Zwaar overgewicht hebt";
        }

        System.out.println(String.format("Uw BMI is %f", bmiRekenen));
        System.out.println(String.format("Als u minstens 20 jaar bent betekent dit dat u %s.", bmiString));
    }
}
