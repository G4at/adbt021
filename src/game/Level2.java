package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;
import java.awt.print.Book;

public class Level2  extends GameLevel {


    public Level2(Game game) {

        super(game);


        getDworfPriest().setPosition(new Vec2(8, -10));
        getCobalt().setPosition(new Vec2(-12, 5));

        getDworfPriest().addCollisionListener(new GoldPickup(getDworfPriest()));


        Shape shape = new BoxShape(25, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -24.5f));

        Shape platform1Shape = new BoxShape(8, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-12f, 2f));

        Shape wallShape = new BoxShape(0.5f, 6f);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-19.5f, 8f));

        StaticBody wall2 = new StaticBody(this, wallShape);
        wall2.setPosition(new Vec2(-4.5f, 8f));

        Shape platform2Shape = new BoxShape(3, 0.5f);
        StaticBody platform2 = new StaticBody(this, platform2Shape);
        platform2.setPosition(new Vec2(-20f, -15f));

        Shape platform3Shape = new BoxShape(3, 0.5f);
        StaticBody platform3 = new StaticBody(this, platform3Shape);
        platform3.setPosition(new Vec2(-5f, -7f));

        Shape platform4Shape = new BoxShape(5, 0.5f);
        StaticBody platform4 = new StaticBody(this, platform4Shape);
        platform4.setPosition(new Vec2(19f, -7f));

        Shape wallShape2 = new BoxShape(0.5f, 3.5f);
        StaticBody wall3 = new StaticBody(this, wallShape2);
        wall3.setPosition(new Vec2(14.5f, -3f));

        Shape platform5Shape = new BoxShape(2.5f, 0.5f);
        StaticBody platform5 = new StaticBody(this, platform5Shape);
        platform5.setPosition(new Vec2(8f, 17f));


        Gold gold1 = new Gold(this);
        gold1.setPosition(new Vec2(-20, -14));

        Gold gold2 = new Gold(this);
        gold2.setPosition(new Vec2(-5, -5));

        Gold gold3 = new Gold(this);
        gold3.setPosition(new Vec2(20, -5));

        Gold gold4 = new Gold(this);
        gold4.setPosition(new Vec2(8, 20));

        Gold gold5 = new Gold(this);
        gold5.setPosition(new Vec2(-20, 20));

        //create some pickups
        // for (int i=0; i<10; i++){
        //  Gold gold = new Gold(this);
        //  gold.setPosition(new Vec2(-5+i*2f,0));


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
        Image background = new ImageIcon("data/Durotar1.jpg").getImage();
        return background;
    }
    @Override
    public String getLevelName() {
        return "Level2";
    }
}