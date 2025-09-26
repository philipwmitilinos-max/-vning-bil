package se.iths.philip.car;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Car();

        System.out.println("Hastighet: " + volvo.getSpeed());
        volvo.accelerate(5);
        System.out.println("Hastighet: " + volvo.getSpeed());
        volvo.start();
        volvo.accelerate(2);
        volvo.accelerate(3);
        System.out.println("Hastighet: " + volvo.getSpeed());
        volvo.stop();
        System.out.println("Hastighet: " + volvo.getSpeed());
    }
}
