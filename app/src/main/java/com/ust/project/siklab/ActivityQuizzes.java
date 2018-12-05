package com.ust.project.siklab;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ust.project.siklab.Database.DatabaseHelper;
import com.ust.project.siklab.Lessons.ActivityLessonOne;

import java.util.ArrayList;

public class ActivityQuizzes extends AppCompatActivity {

    ListView listView;
    ArrayList<ModelLesson> modelLessons;
    private static AdapterQuiz adapterQuiz;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        databaseHelper = new DatabaseHelper(getApplicationContext());

        String lessons[] = getResources().getStringArray(R.array.lesson_list);
        modelLessons = new ArrayList<>();

        for(int i = 0; i < lessons.length; i++) {
            modelLessons.add(new ModelLesson(lessons[i], (i + 1)));
        }

        adapterQuiz = new AdapterQuiz(modelLessons, getApplicationContext());

        listView = (ListView) findViewById(R.id.quiz_list);
        listView.setAdapter(adapterQuiz);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int lessonNumber = position + 1;
                Intent intent = new Intent(getApplicationContext(), ActivityAnswers.class);

                boolean isLearned = databaseHelper.getLessonStatus(lessonNumber) == 1;

                if(position != 0) {
                    if(!isLearned) {
                        Toast.makeText(ActivityQuizzes.this, "You need to finish Lesson No. " + (position + 1) + " first", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        switch(lessonNumber) {
                            case 2:
                                int Lesson2Answers[] = {3, 2, 1, 2, 3};
                                int Lesson2optionsResourceIDs[] = {
                                        R.array.lesson_two_quiz_one_options,
                                        R.array.lesson_two_quiz_two_options,
                                        R.array.lesson_two_quiz_three_options,
                                        R.array.lesson_two_quiz_four_options,
                                        R.array.lesson_two_quiz_five_options,
                                };

                                intent.putExtra("ANSWERS", Lesson2Answers)
                                        .putExtra("LESSON_NUMBER", 2)
                                        .putExtra("QUESTION_RESOURCE", R.array.lesson_two_questions)
                                        .putExtra("OPTION_RESOURCE", Lesson2optionsResourceIDs);

                                startActivity(intent);
                                break;

                            case 3:
                                int Lesson3answers[] = {3, 2, 1, 2, 3};
                                int Lesson3optionsResourceIDs[] = {
                                        R.array.lesson_three_quiz_one_options,
                                        R.array.lesson_three_quiz_two_options,
                                        R.array.lesson_three_quiz_three_options,
                                        R.array.lesson_three_quiz_four_options,
                                        R.array.lesson_three_quiz_five_options,
                                };

                                intent.putExtra("ANSWERS", Lesson3answers)
                                        .putExtra("LESSON_NUMBER", 3)
                                        .putExtra("QUESTION_RESOURCE", R.array.lesson_three_questions)
                                        .putExtra("OPTION_RESOURCE", Lesson3optionsResourceIDs);

                                startActivity(intent);
                                break;

                            case 4:
                                int Lesson4answers[] = {3, 2, 1, 2, 3};
                                int Lesson4optionsResourceIDs[] = {
                                        R.array.lesson_four_quiz_one_options,
                                        R.array.lesson_four_quiz_two_options,
                                        R.array.lesson_four_quiz_three_options,
                                        R.array.lesson_four_quiz_four_options,
                                        R.array.lesson_four_quiz_five_options,
                                };

                                intent.putExtra("ANSWERS", Lesson4answers)
                                        .putExtra("LESSON_NUMBER", 4)
                                        .putExtra("QUESTION_RESOURCE", R.array.lesson_four_questions)
                                        .putExtra("OPTION_RESOURCE", Lesson4optionsResourceIDs);

                                startActivity(intent);
                                break;

                            case 5:
                                int Lesson5answers[] = {3, 2, 1, 2, 3};
                                int Lesson5optionsResourceIDs[] = {
                                        R.array.lesson_five_quiz_one_options,
                                        R.array.lesson_five_quiz_two_options,
                                        R.array.lesson_five_quiz_three_options,
                                        R.array.lesson_five_quiz_four_options,
                                        R.array.lesson_five_quiz_five_options,
                                };

                                intent.putExtra("ANSWERS", Lesson5answers)
                                        .putExtra("LESSON_NUMBER", 5)
                                        .putExtra("QUESTION_RESOURCE", R.array.lesson_five_questions)
                                        .putExtra("OPTION_RESOURCE", Lesson5optionsResourceIDs);

                                startActivity(intent);
                                break;
                        }
                    }
                }
                else {
                    if(isLearned) {
                        int answers[] = {3, 2, 1, 2, 3};
                        int optionsResourceIDs[] = {
                            R.array.lesson_one_quiz_one_options,
                            R.array.lesson_one_quiz_two_options,
                            R.array.lesson_one_quiz_three_options,
                            R.array.lesson_one_quiz_four_options,
                            R.array.lesson_one_quiz_five_options,
                        };

                        startActivity(
                            new Intent(getApplicationContext(), ActivityAnswers.class)
                                    .putExtra("ANSWERS", answers)
                                    .putExtra("LESSON_NUMBER", 1)
                                    .putExtra("QUESTION_RESOURCE", R.array.lesson_one_questions)
                                    .putExtra("OPTION_RESOURCE", optionsResourceIDs)
                        );
                    }
                    else {
                        Toast.makeText(ActivityQuizzes.this, "You need to finish Lesson No. 1 first", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), ActivityLessonOne.class));
                    }
                }
//                int lessonNumber = position + 1;
//                Intent intent = null;
//
//                if (position != 0) {
//                    boolean isLearned =  databaseHelper.getLesson(position).getIs_learned() == 1;
//
//                    if(!isLearned) {
//                        Toast.makeText(ActivityQuizzes.this, "You need to finish Lesson No. " + position + " first", Toast.LENGTH_SHORT).show();
//                    }
//                    else {
//                        switch (lessonNumber) {
//                            case 2 :
////                                intent = new Intent(getApplicationContext(), ActivityLessonTwo.class);
//                                break;
//
//                            case 3 :
////                                intent = new Intent(getApplicationContext(), ActivityLessonThree.class);
//                                break;
//
//                            case 4 :
////                                intent = new Intent(getApplicationContext(), ActivityLessonFour.class);
//                                break;
//
//                            case 5 :
////                                intent = new Intent(getApplicationContext(), ActivityLessonFive.class);
//                                break;
//                        }
//
//                        startActivity(intent);
//                    }
//                }
//                else {
//                    int answers[] = {3, 2, 1, 2, 3};
//                    int optionsResourceIDs[] = {
//                            R.array.lesson_one_quiz_one_options,
//                            R.array.lesson_one_quiz_two_options,
//                            R.array.lesson_one_quiz_three_options,
//                            R.array.lesson_one_quiz_four_options,
//                            R.array.lesson_one_quiz_five_options,
//                    };
//                    startActivity(
//                            new Intent(getApplicationContext(), ActivityAnswers.class)
//                                    .putExtra("ANSWERS", answers)
//                                    .putExtra("LESSON_NUMBER", 1)
//                                    .putExtra("QUESTION_RESOURCE", R.array.lesson_one_questions)
//                                    .putExtra("OPTION_RESOURCE", optionsResourceIDs)
//                    );
//                }
            }
        });
    }
}
