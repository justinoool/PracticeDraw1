package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint();

    {
        paint.setAntiAlias(true);
    }
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
          paint.setStyle(Paint.Style.FILL);
          paint.setColor(Color.parseColor("#880000"));
          canvas.drawArc(100,0,300,200,-180,160,true,paint);

          paint.setColor(Color.YELLOW);
          canvas.drawArc(100,0,300,200,-20,20,true,paint);

          paint.setColor(Color.BLUE);
          canvas.drawArc(110,10,310,200,0,70, true,paint);

          paint.setColor(Color.GREEN);
          canvas.drawArc(100,0,300,200,70,80,true,paint);
          Path path = new Path();
          paint.setStyle(Paint.Style.STROKE);
          path.moveTo(120,50);
          path.lineTo(80,30);
          path.lineTo(50,30);
          canvas.drawPath(path,paint);


          paint.setColor(Color.WHITE);
          paint.setTextSize(15);

          canvas.drawText("A",40,30,paint);
    }
}
