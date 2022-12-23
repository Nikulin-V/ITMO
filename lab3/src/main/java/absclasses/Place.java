package main.java.absclasses;

import main.java.exceptions.ObjectNotFoundException;
import main.java.interfaces.Entitiable;

import java.util.Arrays;
import java.util.Objects;

abstract public class Place implements Entitiable {
    protected String name;
    protected Entitiable[] objects;

    public Place(String name) {
        this.name = name;
        this.objects = new Entitiable[0];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entitiable[] getObjects() {
        return this.objects;
    }

    public void addObject(Entitiable entity) {
        Entitiable[] oldObjects = this.objects;
        this.objects = new Entitiable[oldObjects.length + 1];
        System.arraycopy(oldObjects, 0, this.objects, 0, oldObjects.length);
        this.objects[oldObjects.length] = entity;
    }

    public void removeObject(Entitiable entity) throws ObjectNotFoundException {
        boolean containsEntity = Arrays.asList(this.objects).contains(entity);
        if (containsEntity) {
            this.objects = Arrays.stream(this.objects)
                    .filter(element -> !element.equals(entity))
                    .toArray(Entitiable[]::new);
        } else
            throw new ObjectNotFoundException(this, entity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(name, place.name) && Arrays.equals(objects, place.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(objects));
    }
}
