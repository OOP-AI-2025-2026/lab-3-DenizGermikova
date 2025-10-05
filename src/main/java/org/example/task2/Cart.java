package org.example.task2;

import java.util.Arrays;

public class Cart {
    private final Item[] contents;
    private int index;

    public Cart(int size) {
        this.contents = new Item[size];
        this.index = 0;
    }

    public void add(Item item) {
        if (this.isFull()) {
            System.out.println("Cart is full!");
            return;
        }
        this.contents[this.index++] = item;
    }

    public void removeById(long id) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == id) {
                this.shiftArray(i);
                return;
            }
        }
        System.out.println("Item with id " + id + " not found.");
    }

    private void shiftArray(int startIndex) {
        for (int i = startIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[--this.index] = null;
    }

    public boolean isFull() {
        return this.index == this.contents.length;
    }

    public Item[] getItems() {
        return Arrays.copyOf(this.contents, this.index);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(this.getItems()) +
                '}';
    }
}
