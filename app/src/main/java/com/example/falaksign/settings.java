package com.example.falaksign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button Aboutus = findViewById(R.id.aboutus);
        Button Logout = findViewById(R.id.logout);
        ImageButton homepage=findViewById(R.id.imageButtonback);

        Aboutus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openaboutus();
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openlogut();
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openhomepage();
            }
        });

    }


    public void openaboutus() {
        Intent intent = new Intent(this, aboutus.class);
        startActivity(intent);

    }

    public void openlogut() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void openhomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);

    }
}