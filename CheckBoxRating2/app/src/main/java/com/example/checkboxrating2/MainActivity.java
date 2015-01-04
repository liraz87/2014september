package com.example.checkboxrating2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    /*
    LinearLayout rating1;
    LinearLayout rating2;
    LinearLayout rating3;
    CheckBox star;

    int q1, q2, q3;
    */

    LinearLayout parent;
    MyStarRating myStarRating1;
    MyStarRating myStarRating2;
    MyStarRating myStarRating3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parent = (LinearLayout) findViewById(R.id.parent);
        myStarRating1 = new MyStarRating(this, "first question?", parent);
        myStarRating2 = new MyStarRating(this, "second question?", parent);
        myStarRating3 = new MyStarRating(this, "third question?", parent);


        /*
        rating1 = (LinearLayout) findViewById(R.id.rating1);
        rating2 = (LinearLayout) findViewById(R.id.rating2);
        rating3 = (LinearLayout) findViewById(R.id.rating3);


        for (int i = 1; i <= 5; i++) {
            star = (CheckBox) rating1.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener1);
            star = (CheckBox) rating2.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener2);
            star = (CheckBox) rating3.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener3);
        }
        */
    }


    /*
    private View.OnClickListener starsListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String) v.getTag());
            q1 = tag;
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating1.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating1.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

    private View.OnClickListener starsListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String) v.getTag());
            q2 = tag;
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating2.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating2.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };

    private View.OnClickListener starsListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String) v.getTag());
            q3 = tag;
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating3.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating3.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }
        }
    };


    public void reset(View view) {
        for (int i = 1; i <= 5; i++) {
            star = (CheckBox) rating1.findViewWithTag(String.valueOf(i));
            star.setChecked(false);
        }
    }

    */
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

    public void btnSendResult(View view) {
        Toast.makeText(this, "q1: " + myStarRating1.getValue() + ",q2: " + myStarRating2.getValue()
                        + ",q3: " + myStarRating3.getValue(),
                Toast.LENGTH_LONG).show();
    }
}
