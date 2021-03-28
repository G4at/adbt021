package game;

import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;
import java.awt.*;

 class GameView extends UserView {
    private Image background;
    public GameView(World w, int width, int height) {
        super(w, width, height);
        //background = new ImageIcon("data/ElwynnForest.jpg").getImage();
    }
     public void setBackground(Image background){
         this.background = background;
     }
    @Override
    protected void paintBackground(Graphics2D g) {

        g.drawImage(background, 0, 0, this);
    }




}
