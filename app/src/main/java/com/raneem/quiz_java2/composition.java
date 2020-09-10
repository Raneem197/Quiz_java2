package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class composition extends AppCompatActivity {
    Button ansr3;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composition);

        ansr3=(Button)findViewById(R.id.ansr3);
        t3=(TextView)findViewById(R.id.answer_text3);

    }

    public void ViewAnswe(View view){


        if(t3.getVisibility()==View.GONE)

            t3.setVisibility(View.VISIBLE);

        else
            t3.setVisibility(View.GONE);
    }
}