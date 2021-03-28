package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level1  extends GameLevel implements ActionListener {

    private static final int NUM_ORANGES = 5;
    private Timer timer;

   // @Override
    public void populate(GameLevel level) {
        // Code omitted
        timer = new Timer(1000, this);
        timer.setInitialDelay(100);
        timer.start();
    }

   @Override
     public void actionPerformed(ActionEvent ae) {
       System.out.println("Action event!");
  }




    @Override
    public Image paintBackground() {
        Image background = new ImageIcon("data/ElwynnForest.jpg").getImage();
        return background;}

    public Level1(Game game){
        super(game);

        getDworfPriest().setPosition(new Vec2(0, 0));
        getCobalt().setPosition(new Vec2(17,-10));

        getDworfPriest().addCollisionListener(new GoldPickup(getDworfPriest()));


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



        Gold gold1 = new Gold(this);
        gold1.setPosition(new Vec2(-17,-15));

        Gold gold2 = new Gold(this);
        gold2.setPosition(new Vec2(17,-16));

        Gold gold3 = new Gold(this);
        gold3.setPosition(new Vec2(-10,-5));

        //create some pickups
       // for (int i=0; i<5; i++){
           // Gold gold = new Gold(this);
           // gold.setPosition(new Vec2(i*2f,0));
       // }


    }
    @Override
    public boolean isComplete() {
        if (getDworfPriest().GoldCount() == 3)
            return true;
        else
            return false;
    }

    @Override
    public String getLevelName() {
        return "Level1";
    }

   // @Override
   // public void actionPerformed(ActionEvent e) {

   // }
}

