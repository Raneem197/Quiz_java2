package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Class_Object_Q2 extends AppCompatActivity {
    Button ansr2;
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class__object__q2);

        ansr2=(Button)findViewById(R.id.ansr2);
        t2=(TextView)findViewById(R.id.answer_text2);
    }




    public void ViewAnswe(View view){


        if(t2.getVisibility()==View.GONE)

            t2.setVisibility(View.VISIBLE);

        else
            t2.setVisibility(View.GONE);
    }
}