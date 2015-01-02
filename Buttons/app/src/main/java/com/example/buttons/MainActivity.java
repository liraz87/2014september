package com.example.buttons;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "Button 3 was clicked!", Toast.LENGTH_LONG).show();
            }
        });

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(buttonListener);

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(buttonListener);

    }



    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getBaseContext(), ((Button)v).getText() +
                    " was clicked!", Toast.LENGTH_LONG).show();
        }
    };


    public void onClick(View view){
        Button button = (Button)view;
        Toast.makeText(this, button.getText() + " was clicked!",
                Toast.LENGTH_LONG).show();


    }

    public void onToggle(View view){
        ToggleButton button = (ToggleButton)view;
        Toast.makeText(this, " Toggle mode: " +
                (button.isChecked() ? "on" : "off"),
                Toast.LENGTH_LONG).show();

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
