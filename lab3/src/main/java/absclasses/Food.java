package main.java.absclasses;

public abstract class Food {
    String name;
    private boolean isLikedByTigers;

    public Food(String name) {
        this.name = name;
    }

    public boolean isLikedByTigers() {
        return this.isLikedByTigers;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
