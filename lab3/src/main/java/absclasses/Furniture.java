package main.java.absclasses;

import main.java.interfaces.Entity;

import java.util.Objects;

public abstract class Furniture implements Entity {
    protected String name;
    protected String material;

    public Furniture (String name) {
        this.name = name;
    }
    public Furniture (String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Objects.equals(name, furniture.name) && Objects.equals(material, furniture.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material);
    }
}
