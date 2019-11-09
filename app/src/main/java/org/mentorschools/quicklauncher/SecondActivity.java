package org.mentorschools.quicklauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra ("org.mentorshcools.quicklauncher.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.text);
             String text = getIntent(). getExtras(). getString( "org.mentorschools.quicklauncher.SOMETHING");
             tv.setText(text);}}}
