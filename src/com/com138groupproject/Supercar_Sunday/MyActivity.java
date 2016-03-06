package com.com138groupproject.Supercar_Sunday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener
{
    Button screenOneButton;
    Button screenTwoButton;
    Button screenThreeButton;
    Button screenFourButton;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        screenOneButton = (Button) findViewById(R.id.button1);
        screenOneButton.setOnClickListener(this);
        screenTwoButton = (Button) findViewById(R.id.button2);
        screenTwoButton.setOnClickListener(this);
        screenThreeButton = (Button) findViewById(R.id.button3);
        screenThreeButton.setOnClickListener(this);
        screenFourButton = (Button) findViewById(R.id.button4);
        screenFourButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View itemClicked)
    {
        TextView textView = (TextView) itemClicked;
        if (itemClicked == screenOneButton)
        {
            Intent intent = new Intent(this, Screen1.class);
            startActivity(intent);
        }
        else if (itemClicked == screenTwoButton)
        {
            Intent intent = new Intent(this, Screen2.class);
            startActivity(intent);
        }
        else if (itemClicked == screenThreeButton)
        {
            Intent intent = new Intent(this, Screen3.class);
            startActivity(intent);
        }
        else if (itemClicked == screenFourButton)
        {
            Intent intent = new Intent(this, Screen4.class);
            startActivity(intent);
        }
    }
}
