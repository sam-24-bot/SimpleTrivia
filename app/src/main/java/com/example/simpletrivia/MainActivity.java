package com.example.simpletrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TriviaAnswer1 = findViewById(R.id.TriviaAnswer1);
        TextView TriviaAnswer2 = findViewById(R.id.TriviaAnswer2);

        TriviaAnswer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TriviaAnswer1.setTextColor(Color.GREEN);
                //Want to display a popup to tell the user they got a point & correct
                Context context = getApplicationContext();
                CharSequence text = "Correct! +1 point";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        }
        );

        TriviaAnswer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TriviaAnswer2.setTextColor(Color.RED);
                //want to display a popup to tell user they got 0 points & incorrect
                Context context = getApplicationContext();
                CharSequence text = "Incorrect! Try again! 0 points";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }
        );
    }
}