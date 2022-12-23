package main.java.interfaces;

import main.java.absclasses.Place;
import main.java.enums.Tone;
import main.java.exceptions.CantBeHuggedException;


public interface Creaturable {
    void move(Entitiable entity);
    void hug(Entitiable entity) throws CantBeHuggedException;
    void tell(Entitiable entity, String thought);
    void enter(Place place);
    void say(String phrase);
    void say(String phrase, Entitiable entity);
    void say(String phrase, Entitiable entity, Tone tone);
    void sayHello(Entitiable entity);
    void sayHello(Entitiable entity, Tone tone);
    void understand(String thought);
}
