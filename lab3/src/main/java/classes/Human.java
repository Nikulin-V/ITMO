package main.java.classes;

import main.java.absclasses.Character;
import main.java.enums.Gender;

public class Human extends Character {
    public Human(String name, Gender gender) {
        super(name, gender);
    }

    public String toString() {
        return "<" + this.getName() + " (Human)>";
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Human;
    }
}