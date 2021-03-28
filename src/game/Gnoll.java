package game;

import city.cs.engine.*;

class Gnoll extends Walker {

    private static final Shape GnollShape = new PolygonShape(
            -2.61f,-3.63f, 3.09f,-3.65f, 3.29f,0.53f, -0.08f,3.98f, -3.25f,0.43f, -2.61f,-3.65f, 3.09f,-3.65f);

    private static final BodyImage image =
            new BodyImage("data/Gnoll.png", 8f);


    public Gnoll(World world) {
        super(world, GnollShape);
        addImage(image);
    }
}
