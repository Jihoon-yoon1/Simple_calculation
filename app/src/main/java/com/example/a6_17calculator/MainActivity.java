package com.example.a6_17calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        TextView tv1 = findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(et1.getText().toString())+Integer.parseInt(et2.getText().toString());
                tv1.setText("계산 결과 : "+sum);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int diff = Integer.parseInt(et1.getText().toString())-Integer.parseInt(et2.getText().toString());
                tv1.setText("계산 결과 : "+diff);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int mul = Integer.parseInt(et1.getText().toString())*Integer.parseInt(et2.getText().toString());
                tv1.setText("계산 결과 : "+mul);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int div = Integer.parseInt(et1.getText().toString())/Integer.parseInt(et2.getText().toString());
                tv1.setText("계산 결과 : "+div);

            }
        });
    }
}