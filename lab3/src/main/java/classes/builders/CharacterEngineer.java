package main.java.classes.builders;

import main.java.classes.Character;
import main.java.enums.Gender;

public class CharacterEngineer {
    private final CharacterBuilder builder;

    public CharacterEngineer(CharacterBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Can't create Character without CharacterBuilder!");
        }
    }

    public Character manufactureCharacter(String name, Gender gender) {
        return builder.setName(name).setGender(gender).build();
    }
}
