package emobadara.ensias.com.memorygame.States;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import emobadara.ensias.com.memorygame.R;


public class ThemesActivity extends AppCompatActivity {
    public static Activity themes;
    Button btnPlay, btnlearn , btnlearn2,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        themes=(Activity) this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        btnlearn = (Button) findViewById(R.id.daily1);
        btnlearn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GameActivity.level=1;
                Intent t = new Intent(ThemesActivity.this,GameActivity.class);
                startActivity(t);
            }
        });

        btnlearn2 = (Button) findViewById(R.id.daily2);
        btnlearn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GameActivity.level=2;
                Intent t = new Intent(ThemesActivity.this,GameActivity.class);
                startActivity(t);
            }
        });
        btnlearn2 = (Button) findViewById(R.id.daily3);
        btnlearn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GameActivity.level=3;
                Intent t = new Intent(ThemesActivity.this,GameActivity.class);
                startActivity(t);
            }
        });

        btnlearn2 = (Button) findViewById(R.id.daily4);
        btnlearn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                GameActivity.level=4;
                Intent t = new Intent(ThemesActivity.this,GameActivity.class);
                startActivity(t);
            }
        });
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });


    }

}
