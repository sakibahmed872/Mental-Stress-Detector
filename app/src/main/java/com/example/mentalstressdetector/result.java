package com.example.mentalstressdetector;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Math;

import com.github.lzyzsd.circleprogress.ArcProgress;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ArcProgress arcProgress =  findViewById(R.id.arc_progress);

        int random=(int)( Math.random()*100);

        arcProgress.setProgress(random);
    }
}
