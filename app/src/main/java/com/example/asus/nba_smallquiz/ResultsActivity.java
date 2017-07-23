package com.example.asus.nba_smallquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Asus on 22/7/2017.
 */

public class ResultsActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + "out of " +QuizBook.questions.length);

        if (score == 9){
            mGrade.setText("Wonderful!! You had answer all correctly!");
        }else if (score == 8){
            mGrade.setText("Excellent, only 1 left and you will get all correct!");
        }else if (score == 7) {
            mGrade.setText("Well Done, at least you earn a little knowledge");
        }else {
            mGrade.setText("Get to know more about NBA. Is a fun sport");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });
    }
}
