package main.java.interfaces;

import main.java.absclasses.Place;
import main.java.enums.Tone;


public interface Creaturable {
    void move(Entitiable entity);
    void hug(Entitiable entity);
    void tell(Entitiable entity, String thought);
    void enter(Place place);
    void say(String phrase);
    void say(String phrase, Entitiable entity);
    void say(String phrase, Entitiable entity, Tone tone);
    void sayHello(Entitiable entity);
    void sayHello(Entitiable entity, Tone tone);
    void understand(String thought);
}
