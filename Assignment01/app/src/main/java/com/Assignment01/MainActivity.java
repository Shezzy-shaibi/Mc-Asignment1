package com.Assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnadd,btnsub,btnmul,btndiv,btnnext;
    TextView t1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsub = findViewById(R.id.sub);
        btnadd = findViewById(R.id.add);
        btndiv = findViewById(R.id.div);
        btnmul = findViewById(R.id.mul);
        btnnext = findViewById(R.id.logpgbtn);
        e1 = findViewById(R.id.firstno);
        e2 = findViewById(R.id.secondno);
        t1 = findViewById(R.id.calscreen);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Move next Successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,second.class);
                startActivity(intent);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1Value = Double.parseDouble(e1.getText().toString());
                Double num2Value = Double.parseDouble(e2.getText().toString());

                Double resultValue = num1Value - num2Value;


                t1.setText(Double.toString(resultValue));
//               .setText(e1.getText().toString());

            }
        });

    }
}