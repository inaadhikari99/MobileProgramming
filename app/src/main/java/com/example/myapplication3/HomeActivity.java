package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
Button Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Home=findViewById(R.id.btn_1);
       Home.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
Intent i=new Intent(HomeActivity.this,MainActivity.class);
startActivity(i);
           }
       });
    }

}