package emobadara.ensias.com.memorygame.Sprites;

import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class EventContainer extends Sprite {
    public int screennum;
    public boolean vide;


    /**
     * Constructor
     *  @param image  Bitmap of the Sprite
     * @param hx
     * @param x      LeftTop Corner X-coordinate from where to start drawing
     * @param y      LeftTop Corner Y-coordinate from where to start drawing
     * @param height Height of the Sprite
     * @param width  Width of the sprite
     */
    public EventContainer(Image image, int x, int y, int height, int width,int screennum, Boolean vide) {
        super(image, x, y, height, width);
        this.screennum=screennum;
        this.vide=vide;

    }
}
