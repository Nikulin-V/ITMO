package main.java;

import main.java.classes.Character;
import main.java.classes.*;
import main.java.classes.builders.CharacterBuilder;
import main.java.classes.builders.CharacterEngineer;
import main.java.enums.Gender;
import main.java.enums.Tone;

public class Main {
    public static void main(String[] args) {

        CharacterBuilder builder = new CharacterBuilder();
        CharacterEngineer engineer = new CharacterEngineer(builder);

        Character pooh = engineer.manufactureCharacter("Пух", Gender.MALE);
        Character piglet = engineer.manufactureCharacter("Пятачок", Gender.MALE);
        Character christopherRobin = engineer.manufactureCharacter("Кристофер Робин", Gender.MALE);
        Character tigger = engineer.manufactureCharacter("Тигра", Gender.MALE);
        Character kanga = engineer.manufactureCharacter("Кенга", Gender.FEMALE);
        Character roo = engineer.manufactureCharacter("Крошка Ру", Gender.MALE);
        
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
