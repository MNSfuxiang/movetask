package com.example.movetask;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Testview extends View {
    int x=500,y=500;
    public Testview(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }
    void getXY(int mx,int my)
    {
        x=mx;
        y=my;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);
        Paint paint=new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#B22222"));
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(0,0,200,200,paint);
        paint.setColor(Color.parseColor("#ADFF2F"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x,y,50,paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(x-9,y-9,6,paint);

    }
}
