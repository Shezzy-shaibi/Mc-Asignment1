package com.Assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity {
    Button btnto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnto3 = findViewById(R.id.lognext);
        btnto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(second.this, "Moving to Third", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(second.this,third.class);
                startActivity(intent);
            }
        });
    }
}