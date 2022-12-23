package main.java.exceptions;

import main.java.classes.Character;
import main.java.interfaces.Entitiable;

public class CantBeHuggedException extends RuntimeException {
    private final Character hugger;
    private final Entitiable entity;
    public CantBeHuggedException(Character hugger, Entitiable entity) {
        this.hugger = hugger;
        this.entity = entity;
    }

    public String getMessage() {
        return hugger.getName() + " не может обнять " + entity.getName();
    }
}
