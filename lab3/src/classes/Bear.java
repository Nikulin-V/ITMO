package classes;

import absclasses.Character;
import enums.Gender;

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
