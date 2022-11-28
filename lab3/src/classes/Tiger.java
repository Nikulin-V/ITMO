package classes;

import absclasses.Character;
import enums.Gender;

public class Tiger extends Character {
    public Tiger(String name, Gender gender) {
        super(name, gender);
    }

    public String toString() {
        return "<" + this.getName() + " (Tiger)>";
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Tiger;
    }
}