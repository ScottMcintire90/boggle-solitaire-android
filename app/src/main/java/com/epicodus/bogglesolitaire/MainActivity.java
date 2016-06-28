package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mNewGameButton;
    private static final String[] consonants = new String[] {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z", "Y"};
    private static final String[] vowels = new String[] {"A", "E", "I", "O", "U"};

    private String con1 = consonants[(int)Math.floor(Math.random() * 20)];
    private String con2 = consonants[(int)Math.floor(Math.random() * 20)];
    private String con3 = consonants[(int)Math.floor(Math.random() * 20)];
    private String con4 = consonants[(int)Math.floor(Math.random() * 20)];
    private String con5 = consonants[(int)Math.floor(Math.random() * 20)];

    private String vowel1 = vowels[(int)Math.floor(Math.random() * 5)];
    private String vowel2 = vowels[(int)Math.floor(Math.random() * 5)];
    private String vowel3 = vowels[(int)Math.floor(Math.random() * 5)];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewGameButton = (Button) findViewById(R.id.newGameButton);
        mNewGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewGameActivity.class);
                intent.putExtra("con1", con1);
                intent.putExtra("con2", con2);
                intent.putExtra("con3", con3);
                intent.putExtra("con4", con4);
                intent.putExtra("con5", con5);
                intent.putExtra("vowel1", vowel1);
                intent.putExtra("vowel2", vowel2);
                intent.putExtra("vowel3", vowel3);
                startActivity(intent);

            }
        });
    }
}
