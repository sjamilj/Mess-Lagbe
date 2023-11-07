package com.example.messlagbe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MemberLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_login);
        Intent intent2=getIntent();
    }
    public void signUp(View view){
        Intent intent3=new Intent(this,SignUp.class);
        startActivity(intent3);


    }
}