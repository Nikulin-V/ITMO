package classes;

import absclasses.Character;
import enums.Gender;

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