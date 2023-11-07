package com.example.messlagbe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void messManager(View view){
        Intent intent1=new Intent(this,managerLogin.class);
        startActivity(intent1);


    }
    public void messMember(View view){
        Intent intent2=new Intent(this,MemberLogin.class);
        startActivity(intent2);


    }

}