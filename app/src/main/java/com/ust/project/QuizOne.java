package com.ust.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ust.project.database.DatabaseHelper;

public class QuizOne extends AppCompatActivity {

    public static final int LESSON_NUM = 1;
    public static final int ITEM_NUM = 1;

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private String prefName = "QUIZ_ONE_PREF";
    private static final String ANSWER_STATE = "ANSWER";

    SessionManager sessionManager;
    DatabaseHelper databaseHelper;
    Button nextButton;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        preferences = getSharedPreferences(prefName, 0);
        editor = preferences.edit();

        sessionManager = new SessionManager(getApplicationContext());
        databaseHelper = new DatabaseHelper(getApplicationContext());

        nextButton = findViewById(R.id.next_btn);
        radioGroup = findViewById(R.id.selection);

        int answerID = preferences.getInt(ANSWER_STATE, -1);
        if (answerID > -1) {
            radioButton = findViewById(answerID);
            radioButton.setChecked(true);
        }

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(id);
                int ANSWER = radioGroup.indexOfChild(radioButton);

                editor.putInt(ANSWER_STATE, id);
                editor.commit();

                databaseHelper.addAnswer(LESSON_NUM, ITEM_NUM, ANSWER);
                startActivity(new Intent(QuizOne.this, QuizOne2.class));
            }
        });
    }
}