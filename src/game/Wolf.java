package game;

import city.cs.engine.*;

class Wolf extends Walker {

    private static final Shape WolfShape = new PolygonShape(
            -2.39f,-2.38f, 2.53f,-2.29f, 2.51f,1.7f, 0.26f,2.57f, -2.33f,1.3f, -2.39f,-2.38f);

    private static final BodyImage image =
            new BodyImage("data/wolf.png", 7f);


    public Wolf(World world) {
        super(world, WolfShape);
        addImage(image);
    }
}