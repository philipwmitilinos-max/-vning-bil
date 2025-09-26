package se.iths.philip.calculator;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Fel: kan inte dividera med 0");
            return Double.NaN;
        }
        return a / b;
    }
}
