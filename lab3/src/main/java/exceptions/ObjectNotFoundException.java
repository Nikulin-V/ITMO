package main.java.exceptions;

import main.java.absclasses.Place;
import main.java.interfaces.Entitiable;

public class ObjectNotFoundException extends Exception {
    private final Place place;
    private final Entitiable object;

    public ObjectNotFoundException (Place place, Entitiable object) {
        this.place = place;
        this.object = object;
    }

    public String getMessage() {
        return "Объекта " + object.getName() + " нет в локации " + place.getName();
    }
}
