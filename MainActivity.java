package com.example.sanguk.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( new MyGraphicView(this) );
        setTitle( "ex_09-01" );
    }

    private class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super( context );
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw( canvas );

            Paint paint = new Paint();
            paint.setColor( Color.BLUE );
            paint.setStrokeWidth( 5 );
            canvas.drawLine( 10,10,300,30,paint );

            Rect r1 = new Rect(10,50,10+100,50+100);
            Rect r2 = new Rect(130,50,130+100,50+100);
            RectF r3 = new RectF( 300,300,300+400,300+400 );

            paint.setColor( Color.RED );
            paint.setStrokeWidth( 0 );
            paint.setStyle( Paint.Style.FILL );
            canvas.drawRect( r1,paint );

            paint.setStyle( Paint.Style.STROKE );
            canvas.drawRect( r2, paint);

            paint.setTextSize( 30 );
            canvas.drawText( "안드로이드",100,390,paint );

            paint.setStyle( Paint.Style.FILL );
            canvas.drawArc( r3,180,180,true,paint );
        }
    }
}
