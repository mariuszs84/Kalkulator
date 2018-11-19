package kalkulator;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe:\t\t");
        double a = scanner.nextDouble();
        System.out.print("Wybierz operacje + - * / ^:\t");
        String znak = scanner.next();
        System.out.print("Podaj druga liczbe:\t\t");
        double b = scanner.nextDouble();
        System.out.println("\t\t\t\t=");
        double c=1;

        if (znak.equals("+")) {
            System.out.println("\t\t\t\t" + (a + b));
        } else if (znak.equals("-")) {
            System.out.println("\t\t\t\t" + (a - b));
        } else if (znak.equals("*")) {
            System.out.println("\t\t\t\t" + (a * b));
        } else if (znak.equals("/")) {
            System.out.println("\t\t\t\t" + (a / b));
        } else if (znak.equals("^")) {
            for(int i=0;i<b;i++){
                c*=a;
            }
            System.out.println("\t\t\t\t"+c);
        } else {
            System.out.println("Operacja niedozwolona");
        }
    }

}
