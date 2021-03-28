/*package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    private DworfPriest Dworf;

    public GameWorld(){

        Dworf = new DworfPriest(this);
      // GoldPickup pickup = new GoldPickup(DworfPriest);
      // Dworf.addCollisionListener(pickup);

        Shape shape = new BoxShape(25, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -24.5f));


        Shape platform1Shape = new BoxShape(6, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-17, -19f));


        Shape platform2Shape = new BoxShape(4, 0.8f);
        StaticBody platform2 = new StaticBody(this, platform2Shape);
        platform2.setPosition(new Vec2(17, -13f));

        Shape platform3Shape = new BoxShape(3.5f, 0.6f);
        StaticBody platform3 = new StaticBody(this, platform3Shape);
        platform3.setPosition(new Vec2(-10, -9f));


        // add more bodies here
       // DworfPriest dworf = new DworfPriest(this);
       // dworf.setPosition(new Vec2(0,-10));
      //  dworf.setAlwaysOutline(true);

        Gold gold1 = new Gold(this);
        gold1.setPosition(new Vec2(-17,-15));

        Gold gold2 = new Gold(this);
        gold2.setPosition(new Vec2(17,-16));

        Gold gold3 = new Gold(this);
        gold3.setPosition(new Vec2(-10,-5));


        Cobalt cobalt = new Cobalt(this);
        cobalt.setPosition(new Vec2(17,-5));
       // cobalt.setAlwaysOutline(true);

       // Gnoll gnoll  = new Gnoll(this);
      //  gnoll.setPosition(new Vec2(17,-5));
       // gnoll.setAlwaysOutline(true);

       // Wolf wolf = new Wolf(this );
       // wolf.setPosition(new Vec2(-17, -5));
        //wolf.setAlwaysOutline(true);

       // for (int i=0; i<4; i++) {
      //      Gold a = new Gold(this);
      //      a.setPosition(new Vec2(-10 + i * 4, 10));
        //}
    }

      public DworfPriest getDworf(){ return Dworf; }
}*/