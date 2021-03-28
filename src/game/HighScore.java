/*package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class HighScore {
    private JPanel pnlScores;
    private JPanel pnlControls;
    private JLabel lblPlayerName;
    private JTextField txtName;
    private JLabel lblScoreTitle;
    private JLabel lblScore;
    private JButton btnSave;
    private JButton btnCancel;
    private JList<String> listScores;
    private JScrollPane scrScores;

    private Game game;
    private game.HighScoreWriter highScoreWriter;
    private game.HighScoreReader highScoreReader;
    private final String fileName = "highScore.txt";

    public HighScore(Game game) {
        this.game = game;

        lblScore.setText(game.getPlayer().getCount()+ "");

        File scores = new File(fileName);
        try {
            scores.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        highScoreReader = new game.HighScoreReader(fileName);
        highScoreWriter = new game.HighScoreWriter(fileName);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try  {
                    highScoreWriter.writeHighScore(
                            txtName.getName(),
                            game.getPlayer().getCount()
                    );
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                System.exit(0);
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        DefaultListModel<String> model = new DefaultListModel<>();
        try{
            model.addAll(highScoreReader.readScores());
        }catch (IOException ex){
            ex.printStackTrace();
        }
        listScores.setModel(model);
    }
    public JPanel getPnlScores(){
        return pnlScores;
    }
}*/