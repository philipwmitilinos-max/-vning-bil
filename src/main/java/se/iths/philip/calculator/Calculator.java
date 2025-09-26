package se.iths.philip.calculator;

public class Calculator {
    private int add;
    private int sub;
    private int multi;
    private double div;

    public int getAdd() {
        return add;
    }

    public int getSub() {
        return sub;
    }

    public int getMulti() {
        return multi;
    }

    public double getDiv() {
        return div;
    }

    public void addition(int a, int b) {
        add = a + b;
        System.out.print(a + " + " + b + " = ");
    }

    public void subtraction(int a, int b) {
        sub = a - b;
        System.out.print(a + " - " + b + " = ");
    }

    public void multiplication(int a, int b) {
        multi = a * b;
        System.out.print(a + " * " + b + " = ");
    }

    public void division(double a, double b) {
        div = a / b;
        System.out.print(a + " / " + b + " = ");
    }
}
