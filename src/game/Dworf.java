package game;

import city.cs.engine.*;

class DworfPriest extends Walker {

    public int GoldCount;

    public void addGold() {
        GoldCount++;
        System.out.println("You need more gold: " + "GoldCount = " + GoldCount);
    }

   //  public int getGoldCount(){
      //  return Gold();
    //  }

    private static final Shape DworfPriestShape = new PolygonShape(
            -2.61f, -4.28f,
            2.94f, -4.19f,
            3.37f, 0.92f,
            0.51f, 3.02f,
            -3.15f, 1.04f,
            -2.62f, -4.28f);

    private static final BodyImage image =
            new BodyImage("data/DworfPriest.png", 9f);


    public DworfPriest(World world) {
        super(world, DworfPriestShape);
        addImage(image);

    }


    public void addCredits() {
    }

    public int GoldCount() {return GoldCount;
    }


    // public int GoldCount() {
   // }
}



