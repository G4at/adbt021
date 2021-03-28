package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.IOException;
import java.util.DoubleSummaryStatistics;


public class Game {


    public GameLevel level;
   // private World world;
    private GameView view;
   // private UserView view;
   private KeyBinds controller;
    private SoundClip gameMusic;
    private final JFrame frame;

    public Game() {

        level = new Level1(this);

        //GameWorld world = new GameWorld();

        try {
            gameMusic = new SoundClip("ElwynnForestM.wav");   // Open an audio input stream
            gameMusic.loop();  // Set it to continous playback (looping)
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e);
        }

        view = new GameView(level, 1000,1000);
        view.setZoom(15);

        //Keybinds
        controller = new KeyBinds(level.getDworfPriest());

       // view = new GameView(level, 1000, 1000);
        view.addKeyListener(controller);
        view.setBackground(level.paintBackground());
        // view.setGridResolution(1);
        view.addMouseListener(new GiveFocus(view));
        view.addMouseListener(new MouseHandler(view));


        frame = new JFrame("Game");
        frame.add(view);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        // JFrame debugView = new DebugViewer(world, 500, 500);

       // view.requestFocus();
        level.start();
    }

    public void goToNextLevel() {

        if (level instanceof Level1) {
            level.stop();
            level = new Level2(this);
            view.setWorld(level);
            view.setBackground(level.paintBackground());
            controller.updateDworfPriest(level.getDworfPriest());
            level.start();
           //Dialog diaScore = new JDialog(frame, true);
          //HighScore highScore = new HighScore(this);
          //diaScore.getContentPane().add(highScore.getPnlScores());
          //diaScore.pack();
          //diaScore.setVisible(true);
        } else if (level instanceof Level2) {
            level.stop();
            level = new Level3(this);
            view.setWorld(level);
            view.setBackground(level.paintBackground());
            controller.updateDworfPriest(level.getDworfPriest());
            level.start();
        } else if (level instanceof Level3) {
            System.out.println("Good job!");
            System.exit(0);
        }
    }
    /** Run the game. */
    public static void main(String[] args) {

       new Game();
    }


    public GameLevel getLevel() {
        return level;
    }

    public void setLevel(GameLevel level) { this.level = level; }

}
