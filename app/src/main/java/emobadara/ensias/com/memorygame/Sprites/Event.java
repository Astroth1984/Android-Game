package emobadara.ensias.com.memorygame.Sprites;

import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class Event extends Sprite {
    public int type;


    /**
     * Constructor
     *
     * @param image  Bitmap of the Sprite
     * @param x      LeftTop Corner X-coordinate from where to start drawing
     * @param y      LeftTop Corner Y-coordinate from where to start drawing
     * @param height Height of the Sprite
     * @param width  Width of the sprite
     * @param type   type of the sprite
     *
     */
    public Event(Image image, int x, int y, int height, int width,int type) {
        super(image, x, y, height, width);
        this.type=type;

        setStatic(false);
    }
}




