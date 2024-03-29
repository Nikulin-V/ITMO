package attacks.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, .7);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < .1) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "вызывает метель";
    }
}
