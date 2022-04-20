package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText dateOfBirth;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateOfBirth = (EditText) findViewById(R.id.editTextNumber);
        textView =(TextView) findViewById(R.id.textViewAge);
    }

    public void buttonFindAge(View view) {
        int dob = Integer.parseInt(dateOfBirth.getText().toString());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int age = (year - dob);
        textView.setText("age is:" + age);
    }
}