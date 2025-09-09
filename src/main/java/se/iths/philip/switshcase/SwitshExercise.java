package se.iths.philip.switshcase;

import java.util.Scanner;

public class SwitshExercise {
    public static void main(String[] args) {
        System.out.println("Tryck: 1 För att spela. 2 För att se statisic. 3 För att avsluta.");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                System.out.println("");
                break;
            case "2":
                System.out.println("");
                break;
            case "3":
            default:
        }
    }
}
