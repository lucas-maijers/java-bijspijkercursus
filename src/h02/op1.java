package h02;

import java.util.Scanner;

public class op1 {
    public static void main(String[] args) {
        double mijl = 1.6;
        Scanner sc = new Scanner(System.in);

        System.out.println("Typ het aantal mijlen: ");
        double mijlInput = sc.nextDouble();

        double kmTotaal = mijl * mijlInput;

        System.out.println(mijlInput + " mijlen is " + kmTotaal + " kilometer");
    }
}
