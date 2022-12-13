package main.java.classes;

import main.java.enums.Gender;

public class Tiger extends Character {
    public Tiger(String name, Gender gender) {
        super(name, gender);
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Tiger;
    }
}