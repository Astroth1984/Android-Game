
package emobadara.ensias.com.memorygame.Screens;


import android.content.Intent;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.ButtonUI;
import com.example.emobadaragaminglib.Components.Sprite;

import java.util.ArrayList;
import java.util.List;

import emobadara.ensias.com.memorygame.Assets.Assets;
import emobadara.ensias.com.memorygame.Assets.DailyRoutine3Assets;
import emobadara.ensias.com.memorygame.Sprites.Event;
import emobadara.ensias.com.memorygame.Sprites.EventContainer;
import emobadara.ensias.com.memorygame.States.DiffThemes;
import emobadara.ensias.com.memorygame.States.GameActivity;
import emobadara.ensias.com.memorygame.States.ThemesActivity;

import static emobadara.ensias.com.memorygame.Assets.Assets.background;

public class ArrangeScreen3 extends Screen {

    ButtonUI learn,home,button_back;
    Event e2,e1,e3;
    EventContainer container[][];
    private List<EventContainer> containers= new ArrayList<>();
    private List<Event> events= new ArrayList<>();
    int h_unitc = game.getGraphics().getHeight()/2;
    int w_unitc= game.getGraphics().getWidth()/3;
    int w =game.getGraphics().getWidth()-2*w_unitc/3;
    int wu=w/3;
    int h =game.getGraphics().getHeight()/2;
    int hu=h/3;
    public static int i =0;


    public ArrangeScreen3(Game game) {
        super(game);
        addSprite(new Sprite(background,0,0,game.getGraphics().getHeight(),game.getGraphics().getWidth()));
        putContainers();

    }

    private void putContainers() {
        container=new EventContainer[3][1];
        for(int i=0; i<3;i++) {
            for (int j = 0; j < 1; j++) {

                container[i][j]=new EventContainer(Assets.cont,i*w_unitc,j*h_unitc,h_unitc,w_unitc,0,true);
                addSprite(container[i][j]);
                containers.add(container[i][j]);

            }
        }
        learn= new ButtonUI(Assets.learn,Assets.imageButton,0*w_unitc,1*h_unitc,h_unitc/3,w_unitc/3);
        addSprite(learn);
        home= new ButtonUI(Assets.home,Assets.imageButton,0*w_unitc,h_unitc+hu,h_unitc/3,w_unitc/3);
        addSprite(home);
        button_back= new ButtonUI(Assets.button_back,Assets.imageButton,0*w_unitc,h_unitc+2*hu,h_unitc/3,w_unitc/3);
        addSprite(button_back);



        e1= new Event(DailyRoutine3Assets.lunch, w_unitc/3,1*h_unitc,h_unitc,wu,1);
        addSprite(e1);
        events.add(e1);
        e2= new Event(DailyRoutine3Assets.classes, w_unitc/3+wu,1*h_unitc,h_unitc,wu,2);
        addSprite(e2);
        events.add(e2);
        e3= new Event(DailyRoutine3Assets.play,  w_unitc/3+2*wu,1*h_unitc,h_unitc,wu,3);
        addSprite(e3);
        events.add(e3);


    }

    @Override
    public void render(float deltaTime) {
        Graphics g = game.getGraphics();
        //Redrawing Rick multiple times
        /*Uncomment this line and see what happens */g.drawARGB(255,0,0,0);


    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }
    @Override
    public void dispose() {
        super.dispose();
        System.gc();
    }
    @Override
    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
    }

    @Override
    public void handleTouchUp(int x, int y, int pointer) {
        super.handleTouchUp(x, y, pointer);
        Sprite s = getDraggedSprite();
        if (learn.onTouchUp(x, y)) {
            game.setScreen(new DailyLife2(game));

        }else

        if (button_back.onTouchUp(x,y)){
            Intent intent = new Intent(GameActivity.activity,DiffThemes.class);
            GameActivity.activity.startActivity(intent);
            GameActivity.activity.finish();
            DiffThemes.diffthemes.finish();
        }else

        if (home.onTouchUp(x,y)){
            Intent intent = new Intent(GameActivity.activity,ThemesActivity.class);
            GameActivity.activity.startActivity(intent);
            GameActivity.activity.finish();
            ThemesActivity.themes.finish();
        }


        if (isInserted( containers, events)) {

        } else if (i<3) {
            game.setScreen(new ArrangeScreen(game));
            i++;
            //AudioManager manager1 = (AudioManager)GameActivity.activity.getSystemService(Context.AUDIO_SERVICE);

            //if (!(manager1.isMusicActive())) {

            // Assets.win.play(1);
            //}
        }
    }




    boolean isInserted(List<EventContainer> list, List<Event> events, int marge) {
        boolean result = false;
        for (EventContainer ec : list) {
            for (Event event : events) {
                if (ec.contain(event.getX() + marge, event.getY() + marge) && ec.screennum == event.type) {

                    event.setX(ec.getX() + ec.getHeight() / 18);
                    event.setY(ec.getX() + ec.getHeight() / 18);
                    event.setHeight(ec.getHeight() - ec.getHeight() / 8);
                    event.setWidth(ec.getWidth() - ec.getWidth() / 9);
                    event.setDragged(false);
                    event.setStatic(true);
                    return true;
                }
            }

        }
        return result;
    }


    boolean isInserted(List<EventContainer> list, List<Event> levents){
        boolean resultat=false;
        for (EventContainer c : list){
            for (Event event : levents){
                if (c.contain(event.getX()+w_unitc/2,event.getY()+w_unitc/2) && c.vide==true) {
                    event.setHeight(c.getHeight() - c.getHeight() / 8);
                    event.setWidth(c.getWidth() - c.getWidth() / 9);
                    event.setX(c.getX()+c.getHeight() /18);
                    event.setY(c.getY()+c.getHeight() /18);
                    event.setDragged(false);
                    event.setStatic(true);

                    c.vide=false;


                    return true;
                }
            }

        }
        return resultat;
    }

}
