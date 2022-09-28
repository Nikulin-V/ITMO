package pokemons;


import attacks.physical.StoneEdge;

public class Quagsire extends Wooper {
    public Quagsire(String name, int level) {
        super(name, level);
        this.setStats(95, 85, 85, 65, 65, 35);
        this.addMove(new StoneEdge());
    }
}
