package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizOne2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one2);

        ActionBar actionBarQuizOne2 = getSupportActionBar();
        Button nBtnback = (Button)findViewById(R.id.quizoneback2);
        nBtnback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne2.this, QuizOne.class));
            }
        });

        Button nBtnnext3 = (Button)findViewById(R.id.quizonenext2);
        nBtnnext3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(QuizOne2.this, QuizOne3.class));
            }
        });
    }
}
