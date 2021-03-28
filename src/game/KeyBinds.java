package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class KeyBinds implements KeyListener{

    private static final float WALKING_SPEED = 6;
    private DworfPriest dworf;
    private Game game;
    private GameLevel level;


    public KeyBinds(DworfPriest dworf) {
        this.dworf = dworf;
        this.game = game;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code ==KeyEvent.VK_S){
            try {
                GameSaverLoader.save(game.getLevel(), "data/save.txt");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        else if (code == KeyEvent.VK_L){
                System.out.println("load");
        }

        // other key commands omitted
        if (code == KeyEvent.VK_A) {
            dworf.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_D) {
            dworf.startWalking(WALKING_SPEED);
        } else if (code == KeyEvent.VK_SPACE){
            dworf.jump(15);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            dworf.stopWalking();
        } else if (code == KeyEvent.VK_D) {
            dworf.stopWalking();
        }
    }

    @Override
    public void keyTyped(KeyEvent e){
    }

    public void updateDworfPriest(DworfPriest dworf){
        this.dworf = dworf;
    }
}