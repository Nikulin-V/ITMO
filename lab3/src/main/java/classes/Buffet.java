package main.java.classes;


import main.java.absclasses.Food;
import main.java.absclasses.Furniture;

public class Buffet extends Furniture {
    public Pot[] pots = new Pot[3];
    public Buffet(String name) {
        super(name);
        this.setPots();
    }

    public Buffet(String name, String material) {
        super(name, material);
        this.setPots();
    }

    private void setPots() {
        this.pots[0] = new Pot(
                new Food("мёд") {
                    private final boolean isLikedByTigers = false;
                }
        );
        this.pots[1] = new Pot(
                new Food("жёлуди") {
                    private final boolean isLikedByTigers = false;
                }
        );
        this.pots[2] = new Pot(
                new Food("чертополох") {
                    private final boolean isLikedByTigers = false;
                }
        );
    }
    public static class Pot {
        private final Food content;
        Pot(Food food) {
            this.content = food;
        }

        public Food getContent() {
            return content;
        }
    }

}
