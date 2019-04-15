package com.example.mentalstressdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        Button btn = (Button)findViewById(R.id.btn_next);

        TextView question =(TextView) findViewById(R.id.question);

        RadioButton r1=(RadioButton) findViewById(R.id.radioButton1);
        RadioButton r2=(RadioButton) findViewById(R.id.radioButton2);
        RadioButton r3=(RadioButton) findViewById(R.id.radioButton3);




        question.setText("How do you usually feel before any exam ?");
        r1.setText("Very Stressed");
        r2.setText("Less Stressed");
        r3.setText("No Stress");




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(questions.this, result.class));
            }
        });


    }
}
