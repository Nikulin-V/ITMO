package main.java.classes;

import main.java.enums.Gender;

public class Bear extends Character {
    private String color;

    public Bear(String name, Gender gender) {
        super(name, gender);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
