package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    TextView textView;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        setTitle(R.string.CanvasActivity);
        textView = findViewById(R.id.textView_Color);
        constraintLayout = findViewById(R.id.contrainst_Layout);

        Intent toGet = getIntent();
        String color = toGet.getStringExtra("Color");
        textView.setText(color);

        String [] colors = getResources().getStringArray(R.array.colors_array);
        if(colors == null){
            textView.setText(R.string.app_name);
        }
        if(color.equalsIgnoreCase(colors[0])){
            constraintLayout.setBackgroundColor(Color.RED);
        }else if(color.equalsIgnoreCase(colors[1])){
            constraintLayout.setBackgroundColor(Color.BLUE);
        }else if(color.equalsIgnoreCase(colors[2])) {
            constraintLayout.setBackgroundColor(Color.YELLOW);
        } else if(color.equalsIgnoreCase(colors[3])) {
            constraintLayout.setBackgroundColor(Color.GREEN);
        }else if(color.equalsIgnoreCase(colors[4])) {
            constraintLayout.setBackgroundColor(Color.LTGRAY);
        }else if(color.equalsIgnoreCase(colors[5])) {
            constraintLayout.setBackgroundColor(Color.MAGENTA);
        }else if(color.equalsIgnoreCase(colors[6])) {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }else if(color.equalsIgnoreCase(colors[7])) {
            constraintLayout.setBackgroundColor(Color.CYAN);
        }else if(color.equalsIgnoreCase(colors[8])){
            constraintLayout.setBackgroundColor(Color.rgb(0, 127, 255));
        }else if(color.equalsIgnoreCase(colors[9])) {
            constraintLayout.setBackgroundColor(Color.rgb(255, 0, 127));
        }else if(color.equalsIgnoreCase(colors[10])) {
            constraintLayout.setBackgroundColor(Color.rgb(0, 255, 127));
        }else if(color.equalsIgnoreCase(colors[11])) {
            constraintLayout.setBackgroundColor(Color.rgb(0, 255, 127));
        }else{
            constraintLayout.setBackgroundColor(Color.rgb(0,0,0));
            textView.setText(R.string.app_name);
        }


    }
}