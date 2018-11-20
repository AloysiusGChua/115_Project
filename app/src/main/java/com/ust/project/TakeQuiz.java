package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quiz);

        ActionBar actionBarTakeQuiz = getSupportActionBar();

        Button nBtntakequiz1 = (Button)findViewById(R.id.takequiz);
        nBtntakequiz1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(TakeQuiz.this, QuizOne.class));
            }
        });
    }
}
