package com.example.checkboxrating;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    LinearLayout rating;
    CheckBox star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rating = (LinearLayout)findViewById(R.id.rating);

        for(int i=1; i<=5; i++){
            star = (CheckBox)rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }

    }


    private View.OnClickListener starsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String)v.getTag());
            for (int i=1; i<= tag; i++){
                star = (CheckBox)rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }
            for(int i=tag+1; i<=5; i++){
                star = (CheckBox)rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };


    public void reset(View view){
        for(int i=1; i<=5; i++){
            star = (CheckBox)rating.findViewWithTag(String.valueOf(i));
            star.setChecked(false);
        }
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
}
