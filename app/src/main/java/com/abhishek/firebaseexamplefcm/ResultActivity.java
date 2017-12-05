package com.abhishek.firebaseexamplefcm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by abhishek on 5/12/17.
 */

public class ResultActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView1);
        textView.setText("Result Activity : Attempting to lock now");
    }
}
