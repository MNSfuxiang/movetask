package com.example.movetask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Testview testview=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testview=(Testview)findViewById(R.id.ballview);
        testview.setOnTouchListener(new montouch());

    }
    class montouch implements View.OnTouchListener{
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int x1,y1;
            x1=(int)event.getX();
            y1=(int)event.getY();
            if(event.getAction()==MotionEvent.ACTION_DOWN)
            {
                testview.getXY(x1,y1);
                testview.invalidate();
                if (x1<200&&y1<200)
                {
                    System.exit(0);
                }
                return true;

            }
            else if(event.getAction()==MotionEvent.ACTION_MOVE)
            {
                testview.getXY(x1,y1);
                testview.invalidate();

                if (x1<200&&y1<200)
                {
                    System.exit(0);
                }
              /*  Log.w("坐标", "onTouch: " + "("+ (getx-100)+ ","+getx +(gety-100)+","+gety+ ")" );*/
                return true;
            }
            return testview.onTouchEvent(event);
        }
    }
}
