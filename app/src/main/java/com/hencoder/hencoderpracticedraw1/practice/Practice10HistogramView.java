package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Path path = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
         paint.setColor(Color.WHITE);
         float[] pos = {50,0,50,250,50,250,400,250};
         canvas.drawLines(pos,paint);
         paint.setColor(Color.BLUE);
         canvas.drawRect(70,220,120,250,paint);
         paint.setColor(Color.GREEN);
         canvas.drawRect(140,150,190,250,paint);
         paint.setColor(Color.YELLOW);
         canvas.drawRect(210,200,260,250,paint);

         paint.setColor(Color.WHITE);
         paint.setTextSize(18);
         canvas.drawText("A",95,270,paint);
        canvas.drawText("B",165,270,paint);
        canvas.drawText("C",235,270,paint);

    }
}
