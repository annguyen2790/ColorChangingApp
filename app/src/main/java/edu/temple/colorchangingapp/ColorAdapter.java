package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {
    private Context context;
    String [] colors;
    public ColorAdapter(Context context, String [] colors){
        this.context = context;
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if(view == null){
            textView = new TextView(context);
            textView.setPadding(10,10,10,10);
            textView.setWidth(1);
            textView.setTextSize(20);
        }
        else{
            textView = (TextView) view;
        }
        int color [] = {
                Color.RED, Color.BLUE, Color.YELLOW,
                Color.GREEN, Color.LTGRAY, Color.MAGENTA,
                Color.WHITE, Color.CYAN, Color.rgb(0, 127, 255),
                Color.rgb(255, 0, 127), Color.rgb(0, 255, 127), Color.rgb(127, 127, 255)

        };
        textView.setBackgroundColor(color[i % color.length]);
        textView.setGravity(Gravity.CENTER);
        textView.setText( (String) getItem(i)  );
        return textView;
    }
}
