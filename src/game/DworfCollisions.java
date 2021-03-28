/*package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class DworfCollisions implements CollisionListener {
    private DworfPriest Dworf;

    public DworfCollisions(Dworf cobalt) {
        this.Dworf = Dworf;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Gold) {
            Dworf.addGold();
            e.getOtherBody().destroy();
        } else if (e.get OtherBody() instanceof Gnoll) {
            Dworf.addCredits();
            e.getOtherBody().destroy();
        }
            else if (e.getOtherBody() instanceof Wolf) {
            Dworf.addCredits();
            e.getOtherBody().destroy();
        }
            else if (e.getOtherBody() instanceof Cobalt)
            Dworf.addCredits();
        e.getOtherBody().destroy();
    }
}

*/