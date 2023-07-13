package com.sveri.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare
    EditText etUser,etPwd;
    Button btnSubmit, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise
        etUser = findViewById(R.id.editTextEmail);
        etPwd = findViewById(R.id.editTextTextPassword);

        btnSubmit = findViewById(R.id.buttonSubmit);
        btnCancel = findViewById(R.id.buttonCancel);


        //onclick handlers
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = etUser.getText().toString().trim();
                String pwd = etPwd.getText().toString().trim();

                if (user.equals("sveri") && pwd.equals("android")){
                    Toast.makeText(MainActivity.this, "Authenticated",
                            Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Denied",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etUser.setText(null);
                etPwd.setText(null);
            }
        });
    }
}