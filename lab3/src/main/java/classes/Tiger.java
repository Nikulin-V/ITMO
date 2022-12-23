package main.java.classes;

import main.java.absclasses.Food;
import main.java.enums.Gender;

public class Tiger extends Character {
    private boolean isFoodFound = false;
    private final Paw paw = new Paw("лапа", 5);
    private final Nose nose = new Nose("нос", "чёрный");
    public Tiger(String name, Gender gender) {
        super(name, gender);
    }

    public BodyPart getBodyPart() {
        return Math.random() < 0.5 ? this.paw : this.nose;
    }
    private abstract class BodyPart {
        String name;

        public String getName() {
            return name;
        }
    }

    private class Nose extends BodyPart {
        private final String color;

        private Nose(String name, String color) {
            this.name = name;
            this.color = color;
        }
    }

    private class Paw extends BodyPart {
        private final int length;

        private Paw(String name, int length) {
            this.name = name;
            this.length = length;
        }
    }

    public void stick(BodyPart bodyPart, Buffet.Pot pot) {
        Food potContent = pot.getContent();
        System.out.println(name + " сунул " + bodyPart.getName() + " в горшок и нашёл " + potContent);
        this.checkFood(potContent);
    }

    private void checkFood(Food potContent) {
        if (potContent.isLikedByTigers()) {
            isFoodFound = true;
            System.out.println("Тигры это любят)");
        }
        else System.out.println("Тигры это не любят");
    }

    public void checkFoodFound() {
        String verdict = isFoodFound ? name + " нашёл еду." : name + " ничего этого есть не может.";
        System.out.println(verdict);
    }

    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Tiger;
    }
}