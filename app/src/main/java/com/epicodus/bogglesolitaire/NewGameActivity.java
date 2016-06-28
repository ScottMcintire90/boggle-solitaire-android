package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NewGameActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView mRandomLetters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        Intent intent = getIntent();
        String con1 = intent.getStringExtra("con1");
        String con2 = intent.getStringExtra("con2");
        String con3 = intent.getStringExtra("con3");
        String con4 = intent.getStringExtra("con4");
        String con5 = intent.getStringExtra("con5");
        String vowel1 = intent.getStringExtra("vowel1");
        String vowel2 = intent.getStringExtra("vowel2");
        String vowel3 = intent.getStringExtra("vowel3");
        mRandomLetters = (TextView) findViewById(R.id.randomLetters);
        mRandomLetters.setText(con1 + con2 + vowel1 + con3 + con4 + vowel2 + con5 + vowel3);
    }
}
