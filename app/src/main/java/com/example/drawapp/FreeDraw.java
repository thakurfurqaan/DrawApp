package com.example.drawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FreeDraw extends AppCompatActivity {

    MyCanvas myCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCanvas = new MyCanvas(this,null);
        setContentView(myCanvas);
    }
}