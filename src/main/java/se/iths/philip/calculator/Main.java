package se.iths.philip.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Ange första talet: ");
        double a = scanner.nextDouble();
        System.out.print("Ange andra talet: ");
        double b = scanner.nextDouble();

        System.out.print("Välj operation (+, -, *, /): ");
        String operation = scanner.next();

        double result;
        switch (operation) {
            case "+":
                result = calc.addition((int) a, (int) b);
                break;
            case "-":
                result = calc.subtraction((int) a, (int) b);
                break;
            case "*":
                result = calc.multiplication((int) a, (int) b);
                break;
            case "/":
                result = calc.division(a, b);
                break;
            default:
                System.out.println("Ogiltig operation!");
                return;
        }

        System.out.println("Resultat: " + result);
    }
}
