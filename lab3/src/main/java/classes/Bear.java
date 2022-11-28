package main.java.classes;

import main.java.absclasses.Character;
import main.java.enums.Gender;

public class Bear extends Character {
    public Bear(String name, Gender gender) {
        super(name, gender);
    }

    public String toString() {
        return "<" + this.getName() + " (Bear)>";
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Bear;
    }
}
