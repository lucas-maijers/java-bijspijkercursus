package h03;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class op4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo )");
        int dag = input.nextInt();

        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
        int toekomst = input.nextInt();

        int toekomstdag = toekomst % 7;
        System.out.println(toekomstdag);

        System.out.println(String.format("Vandaag is het %s en over %d dagen is het %s", DateFormatSymbols.getInstance().getWeekdays()[dag - 1], toekomst, DateFormatSymbols.getInstance().getWeekdays()[toekomstdag + 1]));
    }


}
