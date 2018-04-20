package com.example.android.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent i = getIntent();
        String joke = i.getStringExtra("joke");

        TextView textView = (TextView) findViewById(R.id.tv_joke);
        textView.setText(joke);
    }
}
