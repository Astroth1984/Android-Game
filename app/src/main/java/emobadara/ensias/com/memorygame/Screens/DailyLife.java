package emobadara.ensias.com.memorygame.Screens;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.ButtonUI;
import com.example.emobadaragaminglib.Components.Sprite;

import emobadara.ensias.com.memorygame.Assets.Assets;
import emobadara.ensias.com.memorygame.Sprites.Event;
import emobadara.ensias.com.memorygame.Sprites.EventContainer;
import emobadara.ensias.com.memorygame.States.GameActivity;

import static emobadara.ensias.com.memorygame.Assets.Assets.background;
import static emobadara.ensias.com.memorygame.Assets.Assets.btnNext;
import static emobadara.ensias.com.memorygame.Assets.Assets.btnBack;
import static emobadara.ensias.com.memorygame.Assets.Assets.imageButton;
//import static emobadara.ensias.com.memorygame.Assets.Assets.imageButton2;
import static emobadara.ensias.com.memorygame.Assets.DailyRoutineAssets.breakfast;
import static emobadara.ensias.com.memorygame.Assets.DailyRoutineAssets.test;
import static emobadara.ensias.com.memorygame.Assets.DailyRoutineAssets.wakeup;

public class DailyLife extends Screen {
    private final EventContainer daily1,daily2,daily3;
    int h= game.getGraphics().getHeight()/4;
    int w= game.getGraphics().getHeight()/4;
    int hx= game.getGraphics().getHeight()/8;
    int hy= game.getGraphics().getWidth()/8;

    ButtonUI btn , btn_next, btn_back;

    private ButtonUI btn_next2,btn_play,btn_next3;
    private ButtonUI btn_back2 ,btn_back3;
    private ButtonUI btn2,btn3;

    public DailyLife(Game game) {
        super(game);
        addSprite(new Sprite(background,0,0,game.getGraphics().getHeight(),game.getGraphics().getWidth()));

        daily1= new EventContainer(wakeup,hx,hx/6,game.getGraphics().getHeight()-h,game.getGraphics().getWidth()-2*hx,2,true);
        addSprite(daily1);
        daily2= new EventContainer(breakfast,hx,hx/6,game.getGraphics().getHeight()-h,game.getGraphics().getWidth()-2*hx,3,true);
        daily3= new EventContainer(test,hx,hx/6,game.getGraphics().getHeight()-h,game.getGraphics().getWidth()-2*hx,4,true);




        btn_next = new ButtonUI(btnNext,imageButton,game.getGraphics().getWidth()/2 +h+h/2,game.getGraphics().getHeight()-h,h,w);
        btn_next2 = new ButtonUI(btnNext,imageButton,game.getGraphics().getWidth()/2 +h+h/2,game.getGraphics().getHeight()-h,h,w);
        btn_next3 = new ButtonUI(btnNext,imageButton,game.getGraphics().getWidth()/2 +h+h/2,game.getGraphics().getHeight()-h,h,w);

        btn_back = new ButtonUI(btnBack,imageButton,game.getGraphics().getWidth()/2 -h/2-2*h,game.getGraphics().getHeight()-h,h,w);
        btn_back2 = new ButtonUI(btnBack,imageButton,game.getGraphics().getWidth()/2 -h/2-2*h,game.getGraphics().getHeight()-h,h,w);
        btn_back3 = new ButtonUI(btnBack,imageButton,game.getGraphics().getWidth()/2 -h/2-2*h,game.getGraphics().getHeight()-h,h,w);

        btn_play= new ButtonUI(btnNext,imageButton,game.getGraphics().getWidth()-2*hx,2*game.getGraphics().getHeight()/2,h,w);
        addSprite(btn_next);
        addSprite(btn_back3);
        btn = new ButtonUI(imageButton,imageButton,game.getGraphics().getWidth()/2-h/2,game.getGraphics().getHeight()-h,h,w);
        btn3 = new ButtonUI(imageButton,imageButton,game.getGraphics().getWidth()/2-h/2,game.getGraphics().getHeight()-h,h,w);
        btn2 = new ButtonUI(imageButton,imageButton,game.getGraphics().getWidth()/2-h/2,game.getGraphics().getHeight()-h,h,w);
        addSprite(btn);

    }

    @Override
    public void render(float deltaTime) {



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
    public void handleTouchDown(int x, int y, int pointer) {
        super.handleTouchDown(x, y, pointer);
    }

    @Override
    public void handleTouchUp(int x, int y, int pointer) {
        super.handleTouchUp(x, y, pointer);

        if (btn.onTouchUp(x,y)){

            GameActivity.daily1audio1.start();

        }else
        if (btn2.onTouchUp(x,y)) {

            GameActivity.daily1audio2.start();
        }else
        if (btn3.onTouchUp(x,y)) {

            GameActivity.daily1audio3.start();
        }


        if(btn_back3.onTouchUp(x,y)) {

            GameActivity.daily1audio1.pause();


            addSprite(daily3);
            btn_next.setHeight(0);
            btn_back.setHeight(0);
            btn_back3.setHeight(0);
            btn.setHeight(0);
            btn2.setHeight(h);
            btn_back2.setHeight(h);
            addSprite(btn_next3);
            addSprite(btn_back2);
            addSprite(btn2);



        }else

        if (btn_next.onTouchUp(x,y)) {
                GameActivity.daily1audio1.pause();


                addSprite(daily2);
                btn_next.setHeight(0);
                btn.setHeight(0);
                btn2.setHeight(h);
                addSprite(btn_next2);
                addSprite(btn_back);
                addSprite(btn2);


        }else


        if(btn_back.onTouchUp(x,y)) {
            GameActivity.daily1audio2.pause();


            addSprite(daily1);
            btn2.setHeight(0);
            btn_next.setHeight(h);
            btn_back3.setHeight(h);
            btn.setHeight(h);
            addSprite(btn_next);
            addSprite(btn_back3);
            addSprite(btn);
        }else


        if(btn_next2.onTouchUp(x,y)) {
                GameActivity.daily1audio2.pause();


                addSprite(daily3);
                btn_next2.setHeight(0);
                btn_back.setHeight(0);
                btn2.setHeight(0);
                btn3.setHeight(h);
                btn_back2.setHeight(h);
                addSprite(btn_next3);
                addSprite(btn_back2);
                addSprite(btn3);



        }else

        if (btn_back2.onTouchUp(x,y)) {
                GameActivity.daily1audio3.pause();



                addSprite(daily2);
                btn_next2.setHeight(h);

                btn_back2.setHeight(0);
                btn3.setHeight(0);
                btn2.setHeight(h);
                btn_back.setHeight(h);
                addSprite(btn_back);
                addSprite(btn_next2);
                addSprite(btn2);












        }else







        if (btn_next3.onTouchUp(x,y)){
            GameActivity.daily1audio3.pause();


            game.setScreen(new ArrangeScreen(game));

        }

    }

}


