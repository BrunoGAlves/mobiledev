package com.example.project48;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber1;

    private EditText editTextNumber2;
    private EditText editTextNumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber1 = findViewById(R.id.editTextNumber2);
        editTextNumber2 = findViewById(R.id.editTextNumber3);
        editTextNumber3 = findViewById(R.id.editTextNumber5);
    }
    public void somar(View view){
    int x,y,soma;
    x= Integer.parseInt(editTextNumber1.getText().toString());
    y= Integer.parseInt(editTextNumber2.getText().toString());
    soma = x + y;
    editTextNumber3.setText(Integer.toString(soma));
    }
}