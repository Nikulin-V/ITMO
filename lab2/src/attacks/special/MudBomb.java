package attacks.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, .85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < .3) {
            System.out.println("Критический удар!");
            pokemon.setMod(Stat.ACCURACY, -1);
        }
    }

    @Override
    protected String describe() {
        return "бросает грязевую бомбу";
    }
}
