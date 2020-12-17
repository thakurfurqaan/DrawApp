package com.example.drawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class DrawShapes extends AppCompatActivity {

    EditText XInput, YInput;
    Button DrawCircleBtn, DrawRectangleBtn;
    ImageView Drawing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_shapes);

        XInput = (EditText) findViewById(R.id.x_input);
        YInput = (EditText) findViewById(R.id.y_input);

        DrawCircleBtn = (Button) findViewById(R.id.draw_circle);
        DrawRectangleBtn = (Button) findViewById(R.id.draw_rect);

        Drawing = (ImageView) findViewById(R.id.drawing);

        DrawCircleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float radius = Float.parseFloat(XInput.getText().toString());

                Paint paint = new Paint();
                paint.setColor(Color.BLACK);
                paint.setStyle(Paint.Style.STROKE);

                Bitmap bitmap = Bitmap.createBitmap(500, 500 , Bitmap.Config.ARGB_8888);

                Canvas canvas = new Canvas(bitmap);
                canvas.drawCircle(bitmap.getWidth()/2, bitmap.getHeight()/2, radius, paint);

                Drawing.setImageBitmap(bitmap);
            }
        });

        DrawRectangleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float length = Float.parseFloat(XInput.getText().toString());
                float breadth = Float.parseFloat(YInput.getText().toString());

                Paint paint = new Paint();
                paint.setColor(Color.BLACK);
                paint.setStyle(Paint.Style.STROKE);

                Bitmap bitmap = Bitmap.createBitmap(500, 500 , Bitmap.Config.ARGB_8888);

                Canvas canvas = new Canvas(bitmap);
                canvas.drawRect(bitmap.getWidth()/2, bitmap.getHeight()/2, bitmap.getWidth()/2+length, bitmap.getHeight()/2+breadth, paint);

                Drawing.setImageBitmap(bitmap);
            }
        });

    }
}