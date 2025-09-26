package se.iths.philip.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator adder = new Calculator();
        adder.addition(1, 2);
        System.out.println(adder.getAdd());

        Calculator sub = new Calculator();
        sub.subtraction(1, 2);
        System.out.println(sub.getSub());

        Calculator multiplication = new Calculator();
        multiplication.multiplication(1, 2);
        System.out.println(multiplication.getMulti());

        Calculator division = new Calculator();
        division.division(1, 2);
        System.out.println(division.getDiv());
    }
}
