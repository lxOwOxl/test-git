package com.ptithcm.edittextapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registation extends AppCompatActivity {
    EditText editTextFullName, editTextEmail, editTextPassword;
    Button btnCreate;
    TextView textViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);

        editTextFullName = findViewById(R.id.editText1);
        editTextEmail = findViewById(R.id.editText2);
        editTextPassword = findViewById(R.id.editText);
        btnCreate = findViewById(R.id.btnClickMe);
        textViewLogin = findViewById(R.id.textView3);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void createAccount() {
        String fullName = editTextFullName.getText().toString();
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        Toast.makeText(this, "Tài khoản đã được tạo: " + fullName, Toast.LENGTH_SHORT).show();

        finish();
    }
}
