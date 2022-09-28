package pokemons;

import attacks.special.Blizzard;

public class Mamoswine extends Piloswine {
    public Mamoswine(String name, int level) {
        super(name, level);
        this.setStats(110, 130, 80, 70, 60, 80);
        this.addMove(new Blizzard());
    }
}
