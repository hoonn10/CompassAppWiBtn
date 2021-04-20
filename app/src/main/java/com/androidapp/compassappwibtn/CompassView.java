package com.androidapp.compassappwibtn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CompassView extends View {
    Bitmap bitmap ;

    public CompassView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.compass);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int centerx = getWidth()/2;
        int centery = getHeight()/2;

        int x = centerx - bitmap.getWidth()/2;
        int y = centery - bitmap.getHeight()/2;

        canvas.drawBitmap(bitmap,x,y,null);
    }

}