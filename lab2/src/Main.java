import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

// Variant 5646
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Kecleon kecleon = new Kecleon("Кеклеон", 2);
        Wooper wooper = new Wooper("Вупер", 1);
        Quagsire quagsire = new Quagsire("Квагсаер", 3);
        Swinub swinub = new Swinub("Свинаб", 4);
        Piloswine piloswine = new Piloswine("Пилосвайн", 1);
        Mamoswine mamoswine = new Mamoswine("Мамосвайн", 2);

        b.addAlly(kecleon);
        b.addAlly(piloswine);
        b.addAlly(quagsire);

        b.addFoe(swinub);
        b.addFoe(wooper);
        b.addFoe(mamoswine);
        b.go();
    }
}
