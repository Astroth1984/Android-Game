package emobadara.ensias.com.memorygame.States;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e_mobadara.audiomanaging.AudioSettingsActivity;

import emobadara.ensias.com.memorygame.R;


public class DiffThemes extends AppCompatActivity {

    public static Activity diffthemes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        diffthemes=(Activity) this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diff_themes2);
        Button btnlearn2 = (Button) findViewById(R.id.dailyroutine);
        btnlearn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GameActivity.level=3;
                Intent t = new Intent(DiffThemes.this,ThemesActivity.class);
                startActivity(t);
            }
        });
        Button audio = (Button) findViewById(R.id.audio);
        audio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GameActivity.level=63;
                Intent t = new Intent(DiffThemes.this,AudioSettingsActivity.class);
                startActivity(t);
            }
        });
    }
}
