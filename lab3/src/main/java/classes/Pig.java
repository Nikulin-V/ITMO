package main.java.classes;

import main.java.absclasses.Character;
import main.java.enums.Gender;

public class Pig extends Character {
    public Pig(String name, Gender gender) {
        super(name, gender);
    }

    public String toString() {
        return "<" + this.getName() + " (Pig)>";
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Pig;
    }
}