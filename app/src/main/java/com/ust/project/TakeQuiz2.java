package com.ust.project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeQuiz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quiz2);

        ActionBar actionBarTakeQuiz2 = getSupportActionBar();

        Button nBtntakequiz2 = (Button)findViewById(R.id.takequiz2);
        nBtntakequiz2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(TakeQuiz2.this, QuizTwo.class));
            }
        });
    }
}
