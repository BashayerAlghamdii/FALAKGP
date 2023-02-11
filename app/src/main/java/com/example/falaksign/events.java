package com.example.falaksign;

import static com.example.falaksign.R.id.backhome1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        View home1 = findViewById(R.id.homeButton7);
        home1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openhome();
            }
        });

    }
    public void openhome() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);

    }
}
//homeButton7