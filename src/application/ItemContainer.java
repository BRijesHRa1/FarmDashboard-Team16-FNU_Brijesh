package application;

import java.util.ArrayList;
import java.util.List;

public class ItemContainer extends Item {
    private final List<Item> items;

    public ItemContainer(String name, double price, double locationX, double locationY, double length, double width) {
        super(name, price, locationX, locationY, length, width);
        this.items = new ArrayList<>();
    }

    public ItemContainer(String name, int price, int locationX, int locationY, int length, int width, int i) {
        super(name, (double) price, (double) locationX, (double) locationY, (double) length, (double) width);
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
