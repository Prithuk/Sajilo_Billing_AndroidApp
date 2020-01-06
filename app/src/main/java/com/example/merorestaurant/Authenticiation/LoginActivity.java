package com.example.merorestaurant.Authenticiation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.merorestaurant.R;
import com.example.merorestaurant.options_activity;

import static com.example.merorestaurant.R.id.login_btn;

public class LoginActivity extends AppCompatActivity {

    EditText emailEditText, passwordEditText;
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        emailEditText = (EditText) findViewById(R.id.email);
        passwordEditText = (EditText) findViewById(R.id.password);
        Login =(Button) findViewById(login_btn);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailEditTextValue =emailEditText.getText().toString();
                String passwordEditTextValue=passwordEditText.getText().toString();

                Intent intent = new Intent(LoginActivity.this, options_activity.class);
                startActivity(intent);
            }
        });
    }




}



