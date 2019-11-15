package Game.Static;

import java.awt.Graphics;
import java.io.IOException;
import Game.Mechanics.ImageObject;

/**
 * Landmine pack object
 *
 * @author Malkam Golden
 */
public class LandMine extends ImageObject {

    //wall layout
    private final Walls walls;

    /**
     * Constructor
     *
     * @param wall layout
     * @throws IOException
     */
    public LandMine(Walls wall) throws IOException {
        super("Resources/LandMine.gif");
        this.walls = wall;
    }

    /**
     * Draws land mine
     *
     * @param graphic to be drawn on
     */
    @Override
    public void doDrawing(Graphics graphic) {

        for (int row = 0; row < this.walls.getMapHeight(); row++) {

            for (int column = 0; column < this.walls.getMapWidth(); column++) {

                if (this.walls.getWallLayout()[column][row].equals("6")) {

                    graphic.drawImage(super.image, row * super.image.getWidth(), column * super.image.getHeight(), null);
                }

            }

        }

    }

}
