package com.example.simpleloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SucessLogin extends AppCompatActivity {
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess_login);

        backButton = (Button) findViewById(R.id.activity_main_backButton);
        backButton.setOnClickListener(new view1.onclcik

    }
     loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(usernameEditText.getText().length()>0 && passwordEditText.getText().length()>0){
                if(usernameEditText.getText().toString()=="admin") {
                    openSuccessActivity();
                }

}