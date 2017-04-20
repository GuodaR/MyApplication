package com.example.mindaugas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button add = (Button) findViewById(R.id.buttonAdd);
        Button b = (Button) findViewById(R.id.button);
        final EditText text1 = (EditText) findViewById(R.id.text1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
                intent.putExtra("thetext", text1.getText().toString());
                startActivity(intent);
            }
        });
    }
}
