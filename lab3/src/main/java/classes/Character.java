package main.java.classes;

import main.java.absclasses.Place;
import main.java.enums.Gender;
import main.java.enums.Tone;
import main.java.exceptions.CantBeHuggedException;
import main.java.interfaces.Creaturable;
import main.java.interfaces.Entitiable;

import java.util.Objects;

public class Character implements Creaturable, Entitiable {
    protected String name;
    protected Gender gender;
    protected Entitiable near;

    public Character() {
        super();
    }
    public Character(String name, Gender gender) {
        this();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(Entitiable entity) {
        if (this.near != entity) {
            String words = this.gender == Gender.MALE ? "подошёл к" : "подошла к";
            System.out.println(this.getName() + " " +  words + " " + entity.getName());
        }
        this.near = entity;
    }

    public void hug(Entitiable entity) throws CantBeHuggedException {
        if (!(entity instanceof Character))
            throw new CantBeHuggedException(this, entity);

        this.move(entity);
        String words = this.gender == Gender.MALE ? "обнял" : "обняла";
        System.out.println(this.getName() + " " + words + " " + entity.getName());
    }

    public void tell(Entitiable entity, String thought) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "рассказал" : "рассказала";
        System.out.println(this.getName() + " " + words + " " + entity.getName() + ", " + thought);
    }

    public void enter(Place place) {
        this.move(place);
        place.addObject(this);
        String words = this.gender == Gender.MALE ? "вошёл в" : "вошла в";
        System.out.println(this.getName() + " " + words + " " + place.getName());
    }

    public void say(String phrase) {
        System.out.println(this.getName() + ": " + phrase);
    }

    public void say(String phrase, Entitiable entity) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + words +  " " + entity.getName() + ": " + phrase);
    }

    public void say(String phrase, Entitiable entity, Tone tone) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + tone + " " + words + " " + entity.getName() + ": " + phrase);
    }

    public void sayHello(Entitiable entity) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + words + ": Здравствуй, " + entity.getName());
    }

    public void sayHello(Entitiable entity, Tone tone) {
        this.move(entity);
        String words = this.gender == Gender.MALE ? "сказал" : "сказала";
        System.out.println(this.getName() + " " + tone + " "+ words + ": Здравствуй, " + entity.getName());
    }

    @Override
    public void understand(String thought) {
        String words = this.gender == Gender.MALE ? "подумал" : "подумала";
        System.out.println(this.getName() + " " + words + ": " + thought);
    }

    public void jump() {
        String word = this.gender == Gender.MALE ? "прыгал" : "прыгала" ;
        System.out.println(this.getName() + " " + word);
    }

    public void jump(Tone tone) {
        String word = this.gender == Gender.MALE ? "прыгнул" : "прыгнула" ;
        System.out.println(this.getName() + " " + tone + " " + word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, near);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && gender == character.gender && Objects.equals(near, character.near);
    }

    @Override
    public String toString() {
        return "<" + name + " (" + this.getClass().getName() + ")>";
    }
}
