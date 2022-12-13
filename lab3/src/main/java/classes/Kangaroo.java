package main.java.classes;

import main.java.enums.Gender;

public class Kangaroo extends Character {
    public Kangaroo(String name, Gender gender) {
        super(name, gender);
    }

    public String toString() {
        return "<" + this.getName() + " (Kangaroo)>";
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Kangaroo;
    }
}