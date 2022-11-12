package com.example.simpleloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText , passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText= findViewById(R.id.activity_main_usernameEditText);
        passwordEditText = findViewById(R.id.activity_main_passwordEditText);

        loginButton = (Button) findViewById(R.id.activity_main_loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernameEditText.getText().length()>0 && passwordEditText.getText().length()>0){

                        openSuccessActivity();



                }else{
                    String toastMessage = "Please enter user name or password. ";
                    Toast.makeText(getApplicationContext(),toastMessage,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    private void openSuccessActivity(){
        Intent intent = new Intent(this, SuccessLogin.class);
        startActivity(intent);
    }
}