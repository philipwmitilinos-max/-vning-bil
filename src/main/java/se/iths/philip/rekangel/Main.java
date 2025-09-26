package se.iths.philip.rekangel;

public class Main {
    public static void main(String[] args) {
        Rektangel squer = new Rektangel(10, 10);
        squer.area();
        squer.radia();
        squer.setWidth(5);
        squer.getWidth();
        squer.setHeight(25);
        squer.getHeight();
        squer.area();
        squer.radia();
    }
}
