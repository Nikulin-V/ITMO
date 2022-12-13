package main.java.classes.builders;

import main.java.absclasses.builders.CharacterBuilderable;
import main.java.classes.Character;
import main.java.enums.Gender;

public class CharacterBuilder implements CharacterBuilderable {
    private String name;
    private Gender gender;

    public CharacterBuilder() {
        super();
    }

    @Override
    public CharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CharacterBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public Character build() {
        return new Character(name, gender);
    }

}
