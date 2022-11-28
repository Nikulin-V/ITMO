package interfaces;

import absclasses.Place;
import enums.Tone;

;

public interface Creature {
    void move(Entity entity);
    void hug(Entity entity);
    void tell(Entity entity, String thought);
    void enter(Place place);
    void say(String phrase);
    void say(String phrase, Entity entity);
    void say(String phrase, Entity entity, Tone tone);
    void sayHello(Entity entity);
    void sayHello(Entity entity, Tone tone);
    void understand(String thought);
}
