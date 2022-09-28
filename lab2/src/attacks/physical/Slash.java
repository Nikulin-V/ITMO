package attacks.physical;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL, 70, 1.0);
    }

    @Override
    protected double calcCriticalHit(Pokemon attacker, Pokemon defender) {
        if (attacker.getStat(Stat.SPEED) / 64.0 > Math.random()) {
            System.out.println("Критический удар!");
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe() {
        return "режет";
    }
}
