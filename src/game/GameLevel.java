package game;

import city.cs.engine.World;

import java.awt.*;

public abstract class GameLevel extends World {
    private DworfPriest dworf;
    private Cobalt cobalt;
    public abstract Image paintBackground();

    public GameLevel(Game game) {
        dworf = new DworfPriest(this);
        cobalt = new Cobalt(this);
        CobaltEncounter encounter = new CobaltEncounter(this, game);
        dworf.addCollisionListener(encounter);

    }

    public DworfPriest getDworfPriest() {
        return dworf;
    }

    public Cobalt getCobalt() {
        return cobalt;
    }

    public abstract boolean isComplete();

    public abstract String getLevelName();
}