package pokemons;

import attacks.special.Flamethrower;
import attacks.physical.RockTomb;
import attacks.physical.Scratch;
import attacks.physical.Slash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kecleon extends Pokemon {
    public Kecleon(String name, int level) {
        super(name, level);
        this.addType(Type.NORMAL);
        this.setStats(60, 90, 70, 60, 120, 40);
        this.setMove(new Flamethrower(), new Slash(), new RockTomb(), new Scratch());
    }
}
