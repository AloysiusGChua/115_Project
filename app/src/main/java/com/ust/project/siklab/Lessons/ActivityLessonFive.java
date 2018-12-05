package com.ust.project.siklab.Lessons;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ust.project.siklab.ActivityAnswers;
import com.ust.project.siklab.ActivityTakeQuiz;
import com.ust.project.siklab.Database.DatabaseHelper;
import com.ust.project.siklab.R;

public class ActivityLessonFive extends AppCompatActivity {

    private int answers[] = {3, 2, 1, 2, 3};
    private int optionsResourceIDs[] = {
            R.array.lesson_five_quiz_one_options,
            R.array.lesson_five_quiz_two_options,
            R.array.lesson_five_quiz_three_options,
            R.array.lesson_five_quiz_four_options,
            R.array.lesson_five_quiz_five_options,
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);

        String lessonTitle = getResources().getStringArray(R.array.lesson_list)[4];
        getSupportActionBar().setTitle("Lesson 5: " + lessonTitle);

        TextView lessonTitleView = (TextView) findViewById(R.id.lesson_title);
        lessonTitleView.setText("Lesson 5: " + lessonTitle);

        Button completeBtn = (Button) findViewById(R.id.complete_btn);

        DatabaseHelper db = new DatabaseHelper(getApplicationContext());
        final boolean isLearned = db.getLesson(5).getIs_learned() == 1;

        // change text and redirect behavior when quiz is already taken
        if(isLearned) {
            completeBtn.setText("Review Answers");
        }

        completeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isLearned) {
                    startActivity(
                            new Intent(getApplicationContext(), ActivityAnswers.class)
                                    .putExtra("ANSWERS", answers)
                                    .putExtra("LESSON_NUMBER", 5)
                                    .putExtra("QUESTION_RESOURCE", R.array.lesson_three_questions)
                                    .putExtra("OPTION_RESOURCE", optionsResourceIDs)
                    );
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), ActivityTakeQuiz.class);
                    intent.putExtra("LESSON_NUMBER", 5);
                    startActivity(intent);
                }
            }
        });
    }
}
