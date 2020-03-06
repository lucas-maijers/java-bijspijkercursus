package h03;

import java.text.DateFormatSymbols;

public class op3 {
    public static void main(String[] args) {
        int randomMaand = (int) (Math.random() * 12 + 1);

        System.out.println(String.format("Het random getal is %d en dat is de maand %s", randomMaand, DateFormatSymbols.getInstance().getMonths()[randomMaand - 1]));
    }
}
