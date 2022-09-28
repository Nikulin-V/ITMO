package pokemons;

import attacks.special.MudBomb;
import attacks.status.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int level) {
        super(name, level);
        this.setType(Type.ICE, Type.GROUND);
        this.setStats(50, 50, 40, 30, 30, 50);
        this.setMove(new MudBomb(), new Confide());
    }
}

