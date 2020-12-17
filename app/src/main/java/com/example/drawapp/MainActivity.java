package com.example.drawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button FreeDrawBtn, DrawShapesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FreeDrawBtn = (Button) findViewById(R.id.free_draw);
        DrawShapesBtn = (Button) findViewById(R.id.draw_shapes);

        FreeDrawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FreeDraw.class);
                startActivity(intent);
            }
        });

        DrawShapesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawShapes.class);
                startActivity(intent);
            }
        });
    }
}