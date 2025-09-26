package se.iths.philip.switshcase;

import java.util.Scanner;

public class SwitshExercise {
    public static void main(String[] args) {
        System.out.println("Tryck: 1. 2. 3. 4. 5. 6.");
        Scanner scan = new Scanner(System.in);
        int timme = scan.nextInt();
        switch (timme) {
            case 1:
                System.out.println("Ett");
                break;
            case 2:
                System.out.println("Två");
                break;
            case 3:
                System.out.println("Tre");
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Ogiltig timme");
                
        }
    }
}
