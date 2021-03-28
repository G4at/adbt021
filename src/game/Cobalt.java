package game;

import city.cs.engine.*;

class Cobalt extends StaticBody {

    private static final Shape CobaltShape = new PolygonShape(
            -3.57f,-2.3f, 4.0f,-2.3f, 4.24f,0.6f, 0.44f,2.43f, -2.95f,0.81f, -3.57f,-2.28f);

    private static final BodyImage image =
            new BodyImage("data/Portal.png", 5f);


    public Cobalt(World world) {
        super(world, CobaltShape);
        addImage(image);
    }
}
