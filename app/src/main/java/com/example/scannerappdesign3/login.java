package com.example.scannerappdesign3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username = (EditText)findViewById(R.id.userinput);
    EditText password =(EditText)findViewById(R.id.password);
    Button btn =(Button)findViewById(R.id.btnlogin);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }






}