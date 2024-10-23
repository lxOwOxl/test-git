package com.ptithcm.edittextapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textViewRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewRegister = findViewById(R.id.textView3);

        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRegistration();
            }
        });
    }

    public void logIn(View main) {
        Intent intent = new Intent(MainActivity.this, showInformation.class);
        intent.putExtra("Email", editText1.getText().toString());
        intent.putExtra("Password", editText2.getText().toString());
        startActivity(intent);
    }

    public void goToRegistration() {
        Intent iintent = new Intent(MainActivity.this, Registation.class);
        startActivity(iintent);
    }
}
