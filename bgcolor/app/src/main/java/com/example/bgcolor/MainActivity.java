package com.example.bgcolor;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button and root layout by their IDs
        Button myButton = findViewById(R.id.myButton);
        RelativeLayout rootLayout = findViewById(R.id.rootLayout);

        // Set an OnClickListener to the button
        myButton.setOnClickListener(v -> {
            // Change the background color of the root layout
            rootLayout.setBackgroundColor(Color.GREEN); // Change to desired color
        });
    }
}
