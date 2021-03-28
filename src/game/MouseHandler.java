package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler extends MouseAdapter {

    private static final float RADIUS = 1f;

    private static final Shape ballShape
            = new CircleShape(RADIUS);

    private static final BodyImage frostbolt
            = new BodyImage("data/frostbolt.png", 3 * RADIUS);

    private WorldView view;

    public MouseHandler(WorldView view) {
        this.view = view;
    }


    public void mousePressed(MouseEvent e) {
       DynamicBody Frostbolt = new DynamicBody(view.getWorld(), ballShape);
       Frostbolt.setPosition(view.viewToWorld(e.getPoint()));
        Frostbolt.addImage(frostbolt);
    }
}
