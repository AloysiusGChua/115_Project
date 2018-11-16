package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizOne3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one3);

        ActionBar actionBarQuizOne3 = getSupportActionBar();
        Button nBtnback3 = (Button)findViewById(R.id.quizoneback3);
        nBtnback3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne3.this, QuizOne2.class));
            }
        });

        Button nBtnnext3 = (Button)findViewById(R.id.quizonenext3);
        nBtnnext3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne3.this, QuizOne4.class));
            }
        });
    }
}
