package emobadara.ensias.com.memorygame.States;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.emobadaragaminglib.Implementation.AndroidSound;

import emobadara.ensias.com.memorygame.Assets.Assets;
import emobadara.ensias.com.memorygame.Assets.DailyRoutineAssets;
import emobadara.ensias.com.memorygame.Assets.DailyRoutine2Assets;
import emobadara.ensias.com.memorygame.Assets.DailyRoutine3Assets;
import emobadara.ensias.com.memorygame.Assets.DailyRoutine4Assets;

import emobadara.ensias.com.memorygame.R;
import emobadara.ensias.com.memorygame.Screens.ArrangeScreen;
import emobadara.ensias.com.memorygame.Screens.ArrangeScreen2;
import emobadara.ensias.com.memorygame.Screens.ArrangeScreen3;
import emobadara.ensias.com.memorygame.Screens.ArrangeScreen4;
import emobadara.ensias.com.memorygame.Screens.DailyLife;
import emobadara.ensias.com.memorygame.Screens.DailyLife2;
import emobadara.ensias.com.memorygame.Screens.DailyLife3;
import emobadara.ensias.com.memorygame.Screens.DailyLife4;

public class GameActivity  extends AndroidGame {

    public static MediaPlayer daily1audio1,daily1audio2,daily1audio3,daily2audio1,daily2audio2,daily2audio3,daily3audio1,daily3audio2,daily3audio3,daily4audio1,daily4audio2,daily4audio3;

    public static Activity activity;
    public  static int level;
    public  static int score=0;
    Screen screen;


    @Override
    public Screen getInitScreen() {
        activity=(Activity) this;
        //backgroung image
        Assets.background= getGraphics().newImage(R.drawable.background,Graphics.ImageFormat.ARGB8888,getResources());
        //Daily routines
        DailyRoutineAssets.wakeup = getGraphics().newImage(R.drawable.wakeup,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutineAssets.breakfast = getGraphics().newImage(R.drawable.breakfast,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutineAssets.test = getGraphics().newImage(R.drawable.test,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine2Assets.dressed = getGraphics().newImage(R.drawable.dressed,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine2Assets.gotoschool = getGraphics().newImage(R.drawable.gotoschool,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine2Assets.classes = getGraphics().newImage(R.drawable.classes,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine3Assets.classes = getGraphics().newImage(R.drawable.classes,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine3Assets.lunch = getGraphics().newImage(R.drawable.lunch,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine3Assets.play = getGraphics().newImage(R.drawable.play,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine4Assets.dinner = getGraphics().newImage(R.drawable.dinner,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine4Assets.homework = getGraphics().newImage(R.drawable.homework,Graphics.ImageFormat.ARGB8888,getResources());
        DailyRoutine4Assets.bed = getGraphics().newImage(R.drawable.bed,Graphics.ImageFormat.ARGB8888,getResources());
        Assets.cont = getGraphics().newImage(R.drawable.container,Graphics.ImageFormat.ARGB8888,getResources());

        //Buttons
         Assets.imageButton=getGraphics().newImage(R.drawable.sound, Graphics.ImageFormat.ARGB8888,getResources());
         Assets.imageButton2=getGraphics().newImage(R.drawable.sound, Graphics.ImageFormat.ARGB8888,getResources());
         Assets.btnNext=getGraphics().newImage(R.drawable.btn_next, Graphics.ImageFormat.ARGB8888,getResources());
         Assets.btnBack=getGraphics().newImage(R.drawable.btn_back, Graphics.ImageFormat.ARGB8888,getResources());
         Assets.learn=getGraphics().newImage(R.drawable.learn, Graphics.ImageFormat.ARGB8888,getResources());
         Assets.home=getGraphics().newImage(R.drawable.home, Graphics.ImageFormat.ARGB8888,getResources());
         Assets.button_back=getGraphics().newImage(R.drawable.button_back, Graphics.ImageFormat.ARGB8888,getResources());

        //SOUNDS
        daily1audio1=MediaPlayer.create(GameActivity.this, R.raw.daily1audio1);
        daily1audio2=MediaPlayer.create(GameActivity.this, R.raw.daily1audio2);
        daily1audio3=MediaPlayer.create(GameActivity.this, R.raw.daily1audio3);
        daily2audio1=MediaPlayer.create(GameActivity.this, R.raw.daily2audio1);
        daily2audio2=MediaPlayer.create(GameActivity.this, R.raw.daily2audio2);
        daily2audio3=MediaPlayer.create(GameActivity.this, R.raw.daily2audio3);
        daily3audio1=MediaPlayer.create(GameActivity.this, R.raw.daily2audio3);
        daily3audio2=MediaPlayer.create(GameActivity.this, R.raw.daily3audio2);
        daily3audio3=MediaPlayer.create(GameActivity.this, R.raw.daily3audio3);
        daily4audio1=MediaPlayer.create(GameActivity.this, R.raw.daily4audio1);
        daily4audio2=MediaPlayer.create(GameActivity.this, R.raw.daily4audio2);
        daily4audio3=MediaPlayer.create(GameActivity.this, R.raw.daily4audio3);


        Assets.win=(AndroidSound) getAudio().createSound(R.raw.win);
        System.out.print(level);
        switch (level)
        {
            case 1:
                screen= new DailyLife(this);
                break;

            case 2:
               // Assets.click = getAudio().createSound(R.raw.click1);
               //  screen= new ArrangeScreen(this);
                screen= new DailyLife2(this);
                break;
            case 3:

               // Assets.click = getAudio().createSound(R.raw.click1);
              //  screen= new Niveau2(this);
                screen= new DailyLife3(this);
                break;

            case 4:

                // Assets.click = getAudio().createSound(R.raw.click1);
                //  screen= new Niveau2(this);
                screen= new DailyLife4(this);
                break;



        }



        return screen;
    }
    @Override
    public void setScreen(Screen screen) {

        super.setScreen(screen);

    }
    @Override
    protected void onDestroy() {
        //Let's make life easy on your device and get rid of the memo we dont use
        //because Android system does not do that always.
        super.onDestroy();

    }



}