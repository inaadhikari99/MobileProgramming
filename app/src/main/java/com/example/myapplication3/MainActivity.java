package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button home,contactus,camera;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home=findViewById(R.id.btn_1);
        contactus=findViewById(R.id.btn_2);
        camera=findViewById(R.id.btn_3);
        result=findViewById(R.id.result);

//explicit intent
        home.setOnClickListener((new View.OnClickListener(){
            @Override
                public void onClick(View v){
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        }));
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ContactActivity.class);
                startActivity(i);
            }

        });
camera.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent CameraIntent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
startActivity(CameraIntent);
    }
});



    }
}