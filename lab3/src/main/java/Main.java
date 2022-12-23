package main.java;

import main.java.classes.Buffet;
import main.java.classes.Building;
import main.java.classes.Character;
import main.java.classes.Tiger;
import main.java.classes.builders.CharacterBuilder;
import main.java.classes.builders.CharacterEngineer;
import main.java.enums.Gender;
import main.java.enums.Tone;
import main.java.exceptions.CantBeHuggedException;
import main.java.exceptions.EnvironmentVariableNotFoundException;

public class Main {
    public static void main(String[] args) throws EnvironmentVariableNotFoundException {

        CharacterBuilder builder = new CharacterBuilder();
        CharacterEngineer engineer = new CharacterEngineer(builder);

        String bearNameEnv = "BEAR_NAME";
        if (System.getenv(bearNameEnv) == null)
            throw new EnvironmentVariableNotFoundException(bearNameEnv);

        Character pooh = engineer.manufactureCharacter(System.getenv(bearNameEnv), Gender.MALE);
        Character piglet = engineer.manufactureCharacter("Пятачок", Gender.MALE);
        Character christopherRobin = engineer.manufactureCharacter("Кристофер Робин", Gender.MALE);
        Tiger tigger = new Tiger("Тигра", Gender.MALE);
        Character kanga = engineer.manufactureCharacter("Кенга", Gender.FEMALE);
        Character roo = engineer.manufactureCharacter("Крошка Ру", Gender.MALE);
        
        Building house = new Building("дом", kanga);
        Buffet buffet = new Buffet("буфет");

        for (int i = 0; i < 3; i++) {
            tigger.jump(Tone.CHEERFULLY);
            tigger.say("Сюда идти?", christopherRobin);
        }

        house.addObject(christopherRobin);
        tigger.move(house);

        pooh.move(christopherRobin);
        piglet.move(christopherRobin);
        try {
            pooh.hug(christopherRobin);
            piglet.hug(christopherRobin);
        } catch (CantBeHuggedException e) {
            System.out.println(e.getMessage());
        }
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

        for (int potId = 0; potId < buffet.pots.length; potId++) {
            tigger.stick(tigger.getBodyPart(), buffet.pots[potId]);
        }
        tigger.checkFoodFound();
    }
}
