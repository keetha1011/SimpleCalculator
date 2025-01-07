package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v) {
        EditText et1 = findViewById(R.id.editTextText1);
        EditText et2 = findViewById(R.id.editTextText2);
        EditText et3 = findViewById(R.id.editTextText3);

        int result = Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString());

        et3.setText("Added result: " + result);
    }

    public void subtract(View v) {
        EditText et1 = findViewById(R.id.editTextText1);
        EditText et2 = findViewById(R.id.editTextText2);
        EditText et3 = findViewById(R.id.editTextText3);

        int result = Integer.parseInt(et1.getText().toString()) - Integer.parseInt(et2.getText().toString());

        et3.setText("Subtracted result: " + result);
    }

    public void multiply(View v) {
        EditText et1 = findViewById(R.id.editTextText1);
        EditText et2 = findViewById(R.id.editTextText2);
        EditText et3 = findViewById(R.id.editTextText3);

        int result = Integer.parseInt(et1.getText().toString()) * Integer.parseInt(et2.getText().toString());

        et3.setText("Multiplied result: " + result);
    }

    public void divide(View v) {
        EditText et1 = findViewById(R.id.editTextText1);
        EditText et2 = findViewById(R.id.editTextText2);
        EditText et3 = findViewById(R.id.editTextText3);

        int result = Integer.parseInt(et1.getText().toString()) / Integer.parseInt(et2.getText().toString());

        et3.setText("Divided result: " + result);
    }
}