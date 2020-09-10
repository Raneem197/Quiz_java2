package com.raneem.quiz_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ansr;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ansr=(Button)findViewById(R.id.ansr);
        t=(TextView)findViewById(R.id.answer_text);

    }




    public void ViewAnswe(View view){


        if(t.getVisibility()==View.GONE)

            t.setVisibility(View.VISIBLE);

        else
            t.setVisibility(View.GONE);
    }
}