package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Inheritance extends AppCompatActivity {
    Button ansr4;
    TextView t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);
        ansr4=(Button)findViewById(R.id.ansr4);
        t4=(TextView)findViewById(R.id.answer_text4);
    }
    public void ViewAnswe(View view){


        if(t4.getVisibility()==View.GONE)

            t4.setVisibility(View.VISIBLE);

        else
            t4.setVisibility(View.GONE);
    }
}