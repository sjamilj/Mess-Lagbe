package com.example.messlagbe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class managerLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_login);
        Intent intent1=getIntent();
    }
    public void signUp(View view){
        Intent intent3=new Intent(this,SignUp.class);
        startActivity(intent3);


    }
}