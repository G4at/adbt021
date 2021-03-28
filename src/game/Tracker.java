package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import game.GameView;
import org.jbox2d.common.Vec2;

public class Tracker implements StepListener {
    private GameView view;
    private DworfPriest dworf;

    public Tracker(GameView view, DworfPriest Dworf) {
        this.view = view;
        this.dworf = Dworf;
    }

    public void preStep(StepEvent e) {
    }

    public void postStep(StepEvent e) {
        view.setCentre(new Vec2(dworf.getPosition()));
    }
}