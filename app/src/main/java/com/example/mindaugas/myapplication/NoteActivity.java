package com.example.mindaugas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(getIntent().getExtras().getString("thetext"));
    }
}
