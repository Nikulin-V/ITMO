package main.java.classes;

import main.java.enums.Gender;

public class Pig extends Character {
    public Pig(String name, Gender gender) {
        super(name, gender);
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Pig;
    }
}