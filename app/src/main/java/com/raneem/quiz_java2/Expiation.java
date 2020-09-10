package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Expiation extends AppCompatActivity {
    Button ansr8;
    TextView t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expiation);
        ansr8=(Button)findViewById(R.id.ansr8);
        t8=(TextView)findViewById(R.id.answer_text8);
    }

    public void ViewAnswe(View view){


        if(t8.getVisibility()==View.GONE)

            t8.setVisibility(View.VISIBLE);

        else
            t8.setVisibility(View.GONE);
    }

}