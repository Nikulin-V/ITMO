package main.java.absclasses.builders;

import main.java.classes.Character;
import main.java.enums.Gender;

public interface CharacterBuilderable {
    CharacterBuilderable setName(String name);

    CharacterBuilderable setGender(Gender gender);

    Character build();
}
