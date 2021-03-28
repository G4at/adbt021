package game;

import java.io.FileWriter;
import java.io.IOException;

public class GameSaverLoader {

    public static void save(GameLevel level, String fileName)
        throws IOException
    {

        boolean append = false;
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, append);
            writer.write(level.getLevelName() + "," + level.getDworfPriest().GoldCount() + "/n");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }



    public static GameLevel load(String fileName) {
        return null;
        }
    }
