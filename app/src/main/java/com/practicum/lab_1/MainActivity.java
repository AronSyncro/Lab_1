package com.practicum.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));

    }
    class DrawView extends View {
        Paint p;
        Rect rect;
        public DrawView(Context context){
            super(context);
            p = new Paint();
            rect = new Rect();
        }
        @Override
        protected void onDraw(Canvas canvas) {
            //Создаем голову
            p.setColor(Color.GRAY);
            canvas.drawCircle(540, 500,300,p);
            p.setColor(Color.WHITE);
            canvas.drawCircle(420,450,40,p);
            canvas.drawCircle(660,450,40,p);
            p.setColor(Color.BLACK);
            canvas.drawCircle(420,460,25,p);
            canvas.drawCircle(660,460,25,p);
            Path head = new Path();
            p.setColor(Color.LTGRAY);
            head.moveTo(270, 370);
            head.lineTo(200, 180);
            head.lineTo(380, 250);
            head.lineTo(270,370);
            head.moveTo(810,370);
            head.lineTo(880,180);
            head.lineTo(700,250);
            head.lineTo(810,370);
            canvas.drawPath(head, p);
            Path nose = new Path();
            nose.moveTo(540,600);
            nose.lineTo(500,550);
            nose.lineTo(580, 550);
            nose.lineTo(540,600);
            p.setColor(Color.LTGRAY);
            canvas.drawPath(nose, p);
            Path rot = new Path();
            rot.addArc(new RectF(450,550,630,720),0,180);
            p.setColor(Color.RED);
            canvas.drawPath(rot, p);
            //Создаем туловище
            Path body = new Path();
            body.moveTo(450,740);
            body.lineTo(630,740);
            body.lineTo(840, 1500);
            body.lineTo(770, 1600);
            body.lineTo(320, 1600);
            body.lineTo(240,1500);
            body.lineTo(450,740);
            p.setColor(Color.GRAY);
            canvas.drawPath(body,p);
        }

    }
}