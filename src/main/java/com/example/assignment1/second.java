package com.example.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView result,result1;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result = findViewById(R.id.textView);
        result1 = findViewById(R.id.textView2);
        back = findViewById(R.id.button2);
        int sum = getIntent().getIntExtra("sum",0);
        int prod = getIntent().getIntExtra("prod",0);
        result1.setText(Integer.toString(sum));
        result.setText(Integer.toString(prod));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(second.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}
