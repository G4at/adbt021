package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.SoundClip;

public class GoldPickup implements CollisionListener {

    private DworfPriest dworf;
    public GoldPickup(DworfPriest s){
        this.dworf = s;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Gold) {
            dworf.addGold();
            e.getOtherBody().destroy();
        }
    }
}