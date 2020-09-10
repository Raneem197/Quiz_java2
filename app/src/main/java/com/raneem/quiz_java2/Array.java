package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Array extends AppCompatActivity {
    Button ansr5;
    TextView t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        ansr5=(Button)findViewById(R.id.ansr5);
        t5=(TextView)findViewById(R.id.answer_text5);
    }

    public void ViewAnswe(View view){


        if(t5.getVisibility()==View.GONE)

            t5.setVisibility(View.VISIBLE);

        else
            t5.setVisibility(View.GONE);
    }
}