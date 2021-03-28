package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class HoggerEncounter implements CollisionListener {
    private GameLevel level;
    private Game game;
    public HoggerEncounter(GameLevel level, Game game) {
        this.level = level;
        this.game = game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Cobalt && level.isComplete()){
            game.goToNextLevel();
        }
    }
}
