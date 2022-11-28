package main.java.classes;


import main.java.absclasses.Furniture;

public class Buffet extends Furniture {
    public Buffet(String name) {
        super(name);
    }

    public Buffet(String name, String material) {
        super(name, material);
    }
}
