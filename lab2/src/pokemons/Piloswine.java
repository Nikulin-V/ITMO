package pokemons;

import attacks.status.Amnesia;

public class Piloswine extends Swinub {
    public Piloswine(String name, int level) {
        super(name, level);
        this.setStats(100, 100, 80, 60, 60, 50);
        this.addMove(new Amnesia());
    }
}
