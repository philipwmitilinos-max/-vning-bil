package se.iths.philip.project1.player;

import java.util.Random;
import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        System.out.println("Mata in ditt namn: ");
        String name = sc.nextLine();
        player.setName(name);
        while (true) {

            System.out.println("tryck enter för att slå tärningen");
            sc.nextLine();
            int number = random.nextInt(1, 7);
            player.setScore(number);
            System.out.println(player.getScore());
        }

    }
}
