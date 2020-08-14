package com.model;

public class Item implements Comparable<Item> {
    String id;
    String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Item item) {
        return id.compareTo(item.id);
    }
    
}