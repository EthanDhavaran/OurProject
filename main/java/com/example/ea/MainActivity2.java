package com.example.ea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }



    public void ifDontHaveAccount(View view) {
        Intent intent= new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void ifWannaRegister(View view) {
        Intent intent= new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void ifLogging(View view) {
        Intent intent= new Intent(this,infor.class);
        startActivity(intent);
    }
}