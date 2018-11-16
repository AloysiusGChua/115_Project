package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizOne4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one4);

        ActionBar actionBarQuizOne4 = getSupportActionBar();
        Button nBtnback4 = (Button)findViewById(R.id.quizoneback4);
        nBtnback4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne4.this, QuizOne3.class));
            }
        });

        Button nBtnnext4 = (Button)findViewById(R.id.quizonenext4);
        nBtnnext4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne4.this, QuizOne5.class));
            }
        });
    }
}
