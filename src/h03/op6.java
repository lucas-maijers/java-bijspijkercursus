package h03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class op6 {
    public static void main(String[] args) {
        List<Integer> getallen = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Getal 1:");
        getallen.add(input.nextInt());

        System.out.println("Getal 2:");
        getallen.add(input.nextInt());

        System.out.println("Getal 3:");
        getallen.add(input.nextInt());

        // BubbleSort
        int temp;
        boolean fixed = false;

        while (!fixed) {
            fixed = true;

            for (int i = 0; i < getallen.size() - 1; i++) {
                if (getallen.get(i) > getallen.get(i + 1)) {
                    temp = getallen.get(i + 1);
                    getallen.set(i + 1, getallen.get(i));
                    getallen.set(i, temp);
                    fixed = false;
                }
            }
        }

        System.out.println(String.format("Van klein naar groot: %d - %d - %d", getallen.get(0), getallen.get(1), getallen.get(2)));

    }
}
