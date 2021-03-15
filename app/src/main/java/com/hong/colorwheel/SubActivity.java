package com.hong.colorwheel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SubActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
//        imageButton=findViewById(R.id.image_button);
        findViewById(R.id.image_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        
    }
}