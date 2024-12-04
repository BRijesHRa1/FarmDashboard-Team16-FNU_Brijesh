package application;

public class Item {
    private String name;
    private double price;
    private double locationX;
    private double locationY;
    private double length;
    private double width;

    public Item(String name, double price, double locationX, double locationY, double length, double width) {
        this.name = name;
        this.price = price;
        this.locationX = locationX;
        this.locationY = locationY;
        this.length = length;
        this.width = width;
    }

    public Item(String name, int price, int locationX, int locationY, int length, int width) {
        this(name, (double) price, (double) locationX, (double) locationY, (double) length, (double) width);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLocationX() {
        return locationX;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
