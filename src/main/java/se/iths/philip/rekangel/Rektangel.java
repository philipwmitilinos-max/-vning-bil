package se.iths.philip.rekangel;

public class Rektangel {
    private int width;
    private int height;

    public Rektangel(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void area() {
        System.out.println(width * height);
    }

    public void radia() {
        System.out.println(width * 2 + height * 2);
    }
}
