package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Gold extends DynamicBody {

    private static final Shape goldShape = new CircleShape(1);
    private static SoundClip goldSound;

    private static final BodyImage image =
            new BodyImage("data/Gold.png", 2f);

    public Gold(World w) {
        super(w, goldShape);
        addImage(image);
    }
    static {
        try {
            goldSound = new SoundClip("data/GoldSound.wav");
            System.out.println("Loading gold gathering sound");
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e);
        }
    }

    public void destroy()
    {
        goldSound.play();
        super.destroy();

    }

}