package com.example.testingmatrixapi1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonSubmitOnClick(View view) {
        TextView textViewFirstName = findViewById(R.id.textViewFirstName);
        TextView textViewLastName = findViewById(R.id.textViewLastName);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        EditText editTextFirstName = findViewById(R.id.textFieldFirstName);
        EditText editTextLastName = findViewById(R.id.textFieldLastName);
        EditText ediTextEmail = findViewById(R.id.textFieldEmail);

        textViewFirstName.setText("First Name: " +  editTextFirstName.getText());
        textViewLastName.setText("First Name: " +  editTextLastName.getText());
        textViewEmail.setText("First Name: " +  ediTextEmail.getText());

    }
}