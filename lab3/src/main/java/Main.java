package main.java;

import main.java.enums.Gender;
import main.java.enums.Tone;
import main.java.classes.*;

public class Main {
    public static void main(String[] args) {

        Bear pooh = new Bear("Пух", Gender.MALE);
        Pig piglet = new Pig("Пятачок", Gender.MALE);
        Human christopherRobin = new Human("Кристофер Робин", Gender.MALE);
        Tiger tigger = new Tiger("Тигра", Gender.MALE);
        Kangaroo kanga = new Kangaroo("Кенга", Gender.FEMALE);
        Kangaroo roo = new Kangaroo("Крошка Ру", Gender.MALE);
        
        Building house = new Building("дом", kanga);
        Buffet buffet = new Buffet("буфет");

        pooh.move(christopherRobin);
        piglet.move(christopherRobin);
        pooh.hug(christopherRobin);
        piglet.hug(christopherRobin);
        pooh.tell(christopherRobin, "в чём дело");

        pooh.enter(house);
        piglet.enter(house);
        tigger.enter(house);
        roo.sayHello(pooh);
        roo.sayHello(piglet);
        roo.sayHello(tigger);
        roo.sayHello(tigger);
        pooh.tell(kanga, "зачем они пришли");

        kanga.say(
                "Ну что ж, милый Тигра, загляни в мой буфет и посмотри -- что тебе там понравится",
                tigger,
                Tone.AFFECTIONATELY
        );
        kanga.understand("хотя с виду Тигра очень большой, он так же нуждается в ласке, как и Крошка Ру");
    }
}
