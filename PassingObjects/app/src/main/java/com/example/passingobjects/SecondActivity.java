package com.example.passingobjects;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * Created by eladlavi on 12/28/14.
 */
public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Cat myCat = (Cat) getIntent().getExtras().get(MainActivity.MY_CAT);
        Toast.makeText(this, "cat color: " + myCat.getColor() + " gender: " + (myCat.isMale() ? "male" : "female"), Toast.LENGTH_LONG).show();


    }
}
