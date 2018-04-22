package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.example.android.javajokes.Comedian;
import com.example.android.androidjokelibrary.JokeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        // Uncomment for Steps 1 and 2.
        /*Comedian comedian = new Comedian();

        String joke = comedian.tellJoke();*/

        // Step 1: Create a Java Library
        //Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();

        /*// Step 2: Create an Android Library
        Intent i = new Intent(this, JokeActivity.class);
        i.putExtra("joke", joke);
        startActivity(i);*/

        // Step 3: Setup GCE
        new EndpointsAsyncTask().execute(this);

    }

}
