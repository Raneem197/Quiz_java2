package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Interface extends AppCompatActivity {
    Button ansr7;
    TextView t7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        ansr7=(Button)findViewById(R.id.ansr7);
        t7=(TextView)findViewById(R.id.answer_text7);
    }


    public void ViewAnswe(View view){


        if(t7.getVisibility()==View.GONE)

            t7.setVisibility(View.VISIBLE);

        else
            t7.setVisibility(View.GONE);
    }

}