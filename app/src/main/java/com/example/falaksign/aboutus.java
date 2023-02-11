package com.example.falaksign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class aboutus extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        ImageButton back=findViewById(R.id.imageButtonback6);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                opensettings();
            }
        });

    }
    public void opensettings() {
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);

    }


}