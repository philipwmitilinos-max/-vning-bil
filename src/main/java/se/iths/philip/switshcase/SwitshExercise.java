package se.iths.philip.switshcase;

import java.util.Scanner;

public class SwitshExercise {
    public static void main(String[] args) {
        System.out.println("Tryck: 1. 2. 3. 4. 5. 6.");
        System.out.println("För att se tiden för eftermiddagen.");
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        switch (hour) {
            case 1:
                System.out.println("13:00");
                break;
            case 2:
                System.out.println("14:00");
                break;
            case 3:
                System.out.println("15:00");
                break;
            case 4:
                System.out.println("16:00");
                break;
            case 5:
                System.out.println("17:00");
                break;
            case 6:
                System.out.println("18:00");
                break;
            default:
                System.out.println("Ogiltig hour");

        }
        scan.close();
    }
}
