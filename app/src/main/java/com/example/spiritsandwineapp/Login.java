package com.example.spiritsandwineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity {

    @BindView(R.id.emailEditText)
    EditText mEmailEditText;
    @BindView(R.id.passWordEditText)
    EditText mPasswordEditText;
    @BindView(R.id.loginButton)
    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmailEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                if(password.equals("") | email.equals("")){
                    Toast.makeText(Login.this, "Please Enter All Credentials", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Login.this, SpiritsAndWines.class);
                    intent.putExtra("email", email);
                    startActivity(intent);
                }

            }
        });
    }
}