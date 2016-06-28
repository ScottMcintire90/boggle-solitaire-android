package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class NewGameActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView mRandomLetters;
    @Bind (R.id.userGuess) EditText mUserGuess;
    @Bind (R.id.submitWord) Button mSubmitWord;
    private ListView mListView;
    private ArrayList<String> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        ButterKnife.bind(this);

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

        mUserGuess = (EditText) findViewById(R.id.userGuess);


        mSubmitWord.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String word = mUserGuess.getText().toString();
                words.add(word);
                mUserGuess.setText("");
                Intent newIntent = new Intent(NewGameActivity.this, ScoreboardActivity.class);
                newIntent.putStringArrayListExtra("words", words);
                startActivity(newIntent);
            }
        });
    }
}
