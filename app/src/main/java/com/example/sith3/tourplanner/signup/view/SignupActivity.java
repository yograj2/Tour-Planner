package com.example.sith3.tourplanner.signup.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sith3.tourplanner.R;
import com.example.sith3.tourplanner.login.view.LoginActivity;

public class SignupActivity extends AppCompatActivity {

    public EditText username;
    public EditText emailaddress;
    public EditText password;
    public EditText conformpassword;
    private Button button;
    Intent intent;
    Context context;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.Username);
        emailaddress = findViewById(R.id.emailAddress);
        password = findViewById(R.id.Password);
        conformpassword = findViewById(R.id.ConformPassword);
        button = findViewById(R.id.signup);
        textView = findViewById(R.id.tv_signup_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = username.getText().toString();
                String Email = emailaddress.getText().toString();
                String Password = password.getText().toString();
                String Conformpassword = conformpassword.getText().toString();

                if(Username.isEmpty()){
                    Toast.makeText(context,"User Name should be not empty",Toast.LENGTH_SHORT).show();
                }
                else if (Email.isEmpty()){
                    Toast.makeText(context, "Email Id should be not empty", Toast.LENGTH_SHORT).show();
                }
                else if (Password.isEmpty()){
                    Toast.makeText(context,"Password should not be empty",Toast.LENGTH_SHORT).show();
                }
                else if (Conformpassword.isEmpty()){
                    Toast.makeText(context,"Conform password should not be empty",Toast.LENGTH_SHORT).show();
                }
                else if (!Password.equals(Conformpassword)){
                    Toast.makeText(context,"Password should  not same",Toast.LENGTH_SHORT).show();
                }
                else{
                    intent = new Intent(SignupActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            }

        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }
}

