package com.dragonfury.duy.p4a01nguyendennismydrawingapp2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint nam = new Paint();
        canvas.drawColor(Color.YELLOW);
        nam.setColor(Color.WHITE);
        canvas.drawCircle(300,500,150,nam);
        canvas.drawCircle(1150,500,150,nam);
        nam.setColor(Color.BLUE);
        canvas.drawCircle(300,500,50,nam);
        canvas.drawCircle(1150,500,50,nam);
        nam.setTextSize(250);
        canvas.drawText("Hi Vinh!",225,275,nam);
        RectF nammy = new RectF(300,900,1100,1250);
        nam.setColor(Color.RED);
        nam.setStyle(Paint.Style.STROKE);
        nam.setStrokeWidth(25);
        canvas.drawRect(300,900,1100,1250,nam);
        nam.setColor(Color.argb(100,255,83,13));
        nam.setStyle(Paint.Style.FILL);
        canvas.drawOval(nammy,nam);
        nam.setStrokeWidth(500);
        nam.setColor(Color.RED);
        nam.setStyle(Paint.Style.STROKE);
        nam.setStrokeWidth(25);
        canvas.drawLine(100,2000,200,1900,nam);

    }
}
