package com.example.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2,num3;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editText);
        num2 = findViewById(R.id.editText2);
        num3 = findViewById(R.id.editText3);
        cal = findViewById(R.id.button);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = Integer.parseInt(num1.getText().toString());
                int two = Integer.parseInt(num2.getText().toString());
                int three = Integer.parseInt(num3.getText().toString());
                int sum = one+two+three;
                int prod = one*two*three;
                Intent i = new Intent(MainActivity.this,second.class);
                i.putExtra("sum",sum);
                i.putExtra("prod",prod);
                startActivity(i);

            }
        });
    }
}
