package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Polymorphism extends AppCompatActivity {
    Button ansr6;
    TextView t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorphism);
        ansr6=(Button)findViewById(R.id.ansr6);
        t6=(TextView)findViewById(R.id.answer_text6);}


    public void ViewAnswe(View view){


        if(t6.getVisibility()==View.GONE)

            t6.setVisibility(View.VISIBLE);

        else
            t6.setVisibility(View.GONE);
    }
}