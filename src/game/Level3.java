package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class Level3  extends GameLevel {

    public Level3(Game game){
        super(game);

        getDworfPriest().setPosition(new Vec2(0, -17));
        getCobalt().setPosition(new Vec2(0,18));


        getDworfPriest().addCollisionListener(new GoldPickup(getDworfPriest()));


        Shape shape = new BoxShape(25, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -24.5f));

        Shape platform1Shape = new BoxShape(5, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(0, -11f));

        Shape platform2Shape = new BoxShape(5, 0.5f);
        StaticBody platform2 = new StaticBody(this, platform2Shape);
        platform2.setPosition(new Vec2(-20, -20f));

        Shape platform3Shape = new BoxShape(5, 0.5f);
        StaticBody platform3 = new StaticBody(this, platform3Shape);
        platform3.setPosition(new Vec2(20, -20f));

        Shape platform4Shape = new BoxShape(3.5f, 0.5f);
        StaticBody platform4 = new StaticBody(this, platform4Shape);
        platform4.setPosition(new Vec2(-15, -2f));

        Shape platform5Shape = new BoxShape(3.5f, 0.5f);
        StaticBody platform5 = new StaticBody(this, platform5Shape);
        platform5.setPosition(new Vec2(15, -2f));

        Shape platform6Shape = new BoxShape(3.5f, 0.5f);
        StaticBody platform6 = new StaticBody(this, platform6Shape);
        platform6.setPosition(new Vec2(-22, 6f));

        Shape platform7Shape = new BoxShape(3.5f, 0.5f);
        StaticBody platform7 = new StaticBody(this, platform7Shape);
        platform7.setPosition(new Vec2(22, 6f));

        Shape platform8Shape = new BoxShape(8, 0.5f);
        StaticBody platform8 = new StaticBody(this, platform8Shape);
        platform8.setPosition(new Vec2(0, 15f));

        Shape wallShape = new BoxShape(0.5f, 10f);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-7.5f, 25f));


        Gold gold1 = new Gold(this);
        gold1.setPosition(new Vec2(-20,-17));

        Gold gold2 = new Gold(this);
        gold2.setPosition(new Vec2(20,-17));

        Gold gold3 = new Gold(this);
        gold3.setPosition(new Vec2(-15,0));

        Gold gold4 = new Gold(this);
        gold4.setPosition(new Vec2(-22,7));

        Gold gold5 = new Gold(this);
        gold5.setPosition(new Vec2(22,7));

    }
    @Override
    public boolean isComplete() {
        if (getDworfPriest().GoldCount() == 5)
            return true;
        else
            return false;
    }
    @Override
    public Image paintBackground() {
        Image background = new ImageIcon("data/Dun.jpg").getImage();
        return background;
    }
    @Override
    public String getLevelName() {
        return "Level3";
    }
}
