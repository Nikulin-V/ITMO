package classes;

import absclasses.Character;
import absclasses.Place;

public class Building extends Place {
    protected Character owner;

    public Building(String name) {
        super(name);
    }

    public Building(String name, Character owner) {
        super(name);
        this.owner = owner;
    }
}
