package h04;

import java.util.Random;

public class op5 {
    public static void main(String[] args) {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        System.out.println(c);
    }
}
