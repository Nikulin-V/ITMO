package main.java.absclasses;

import main.java.interfaces.Entity;

import java.util.Arrays;
import java.util.Objects;

abstract public class Place implements Entity {
    protected String name;
    protected Entity[] objects;

    public Place(String name) {
        this.name = name;
        this.objects = new Entity[0];
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Entity[] getObjects() {
        return this.objects;
    }

    public void addObject(Entity entity) {
        Entity[] oldObjects = this.objects;
        this.objects = new Entity[oldObjects.length + 1];
        System.arraycopy(oldObjects, 0, this.objects, 0, oldObjects.length);
        this.objects[oldObjects.length] = entity;
    }

    public void removeObject(Entity entity) {
        boolean containsEntity = Arrays.asList(this.objects).contains(entity);
        if (containsEntity) {
            this.objects = Arrays.stream(this.objects)
                    .filter(element -> !element.equals(entity))
                    .toArray(Entity[]::new);
        }
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
