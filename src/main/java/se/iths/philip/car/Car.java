package se.iths.philip.car;

public class Car {
    private int speed = 0;
    private boolean started = false;

    public int getSpeed() {
        return speed;
    }

    public void start() {
        started = true;
    }

    public void stop() {
        if (isMoving()) {
            speed = 0;
            started = false;
        } else {
            System.out.println("Bilen står redan stilla.");
        }
    }

    public void accelerate(int acceleration) {
        if (started == true) {
            speed = speed + acceleration;

        } else {
            System.out.println("Starta bilen först!");
        }
    }

    private boolean isMoving() {
        if (speed > 0) {
            return true;
        } else {
            return false;
        }
    }
}
