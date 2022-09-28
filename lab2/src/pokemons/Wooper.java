package pokemons;


import attacks.physical.Bulldoze;
import attacks.special.IceBeam;
import attacks.special.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wooper extends Pokemon {
    public Wooper(String name, int level) {
        super(name, level);
        this.addType(Type.WATER);
        this.addType(Type.GROUND);
        this.setStats(55, 45, 45, 25, 25, 15);
        this.setMove(new WaterGun(), new Bulldoze(), new IceBeam());
    }
}
