package absclasses;

import enums.Gender;
import interfaces.Creature;
import interfaces.Entity;
import enums.Tone;

import java.util.Objects;

public abstract class Character implements Creature, Entity {
    protected String name;
    protected Gender gender;
    protected Entity isNear;

    public Character (String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move(Entity entity) {
        if (this.isNear != entity) {
            String words = this.gender == Gender.MALE ? "подошёл к" : "подошла к";
            System.out.println(this.getName() + " " +  words + " " + entity.getName());
        }
        this.isNear = entity;
    }

    @Override
    public void hug(Entity entity) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "обнял" : "обняла";
        System.out.println(this.getName() + " " + words + " " + entity.getName());
    }

    @Override
    public void tell(Entity entity, String thought) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "рассказал" : "рассказала";
        System.out.println(this.getName() + " " + words + " " + entity.getName() + ", " + thought);
    }

    @Override
    public void enter(Place place) {
        this.move(place);
        place.addObject(this);
        String words = this.gender == Gender.MALE ? "вошёл в" : "вошла в";
        System.out.println(this.getName() + " " + words + " " + place.getName());
    }

    @Override
    public void say(String phrase) {
        System.out.println(this.getName() + ": " + phrase);
    }

    @Override
    public void say(String phrase, Entity entity) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + words +  " " + entity.getName() + ": " + phrase);
    }

    @Override
    public void say(String phrase, Entity entity, Tone tone) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + tone + " " + words + " " + entity.getName() + ": " + phrase);
    }

    @Override
    public void sayHello(Entity entity) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + words + ": Здравствуй, " + entity.getName());
    }

    @Override
    public void sayHello(Entity entity, Tone tone) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + tone + " "+ words + ": Здравствуй, " + entity.getName());
    }

    @Override
    public void understand(String thought) {
        String words = this.gender == Gender.MALE ? "подумал" : "подумала";
        System.out.println(this.getName() + " " + words + ": " + thought);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, isNear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && gender == character.gender && Objects.equals(isNear, character.isNear);
    }
}
