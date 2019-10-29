package emobadara.ensias.com.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ensias_auth_library.FoxyAuth;

import emobadara.ensias.com.memorygame.States.DiffThemes;

public class MainnActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);
        //FoxyAuth.emerge(this,MainnActivity.class);

        btn = (Button) findViewById(R.id.start);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent t = new Intent(MainnActivity.this,DiffThemes.class);
                startActivity(t);
            }
        });
    }
}

