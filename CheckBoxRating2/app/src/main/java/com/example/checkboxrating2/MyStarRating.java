package com.example.checkboxrating2;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by eladlavi on 1/4/15.
 */
public class MyStarRating extends LinearLayout {
    private TextView question;
    private LinearLayout rating;
    private int value;
    private CheckBox star;

    public MyStarRating(Context context, String question, LinearLayout parent) {
        super(context);
        this.setOrientation(VERTICAL);
        this.question = new TextView(context);
        this.question.setText(question);
        this.addView(this.question, new LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));
        rating = new LinearLayout(context);
        rating.setOrientation(HORIZONTAL);
        for(int i=1;i<=5;i++){
            CheckBox checkBox = new CheckBox(context);
            checkBox.setTag(i);
            checkBox.setOnClickListener(this.starsListener);
            rating.addView(checkBox, new LayoutParams(LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT));
        }
        this.addView(rating,new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));
        parent.addView(this, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
    }

    private View.OnClickListener starsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = (Integer) v.getTag();
            value = tag;
            for (int i = 1; i <= tag; i++) {
                star = (CheckBox) rating.findViewWithTag(i);
                star.setChecked(true);
            }
            for (int i = tag + 1; i <= 5; i++) {
                star = (CheckBox) rating.findViewWithTag(i);
                star.setChecked(false);
            }
        }
    };

    public int getValue() {
        return value;
    }
}
