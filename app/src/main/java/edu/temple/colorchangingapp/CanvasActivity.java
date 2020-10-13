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
        if(color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Rouge")){
            constraintLayout.setBackgroundColor(Color.RED);
        }else if(color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Bleu")){
            constraintLayout.setBackgroundColor(Color.BLUE);
        }else if(color.equalsIgnoreCase("Yellow") || color.equalsIgnoreCase("Jaune")) {
            constraintLayout.setBackgroundColor(Color.YELLOW);
        } else if(color.equalsIgnoreCase("Green") || color.equalsIgnoreCase("Vert")) {
            constraintLayout.setBackgroundColor(Color.GREEN);
        }else if(color.equalsIgnoreCase("LightGrey") || color.equalsIgnoreCase("Gris clair")) {
            constraintLayout.setBackgroundColor(Color.LTGRAY);
        }else if(color.equalsIgnoreCase("Magenta") || color.equalsIgnoreCase("Magentana")) {
            constraintLayout.setBackgroundColor(Color.MAGENTA);
        }else if(color.equalsIgnoreCase("White") || color.equalsIgnoreCase("Blanc")) {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }else if(color.equalsIgnoreCase("Cyan") || color.equalsIgnoreCase("Cyana")) {
            constraintLayout.setBackgroundColor(Color.CYAN);
        }else if(color.equalsIgnoreCase("LightBlue") || color.equalsIgnoreCase("Bleu clair")) {
            constraintLayout.setBackgroundColor(Color.rgb(0, 127, 255));
        }else if(color.equalsIgnoreCase("Pink") || color.equalsIgnoreCase("Rose")) {
            constraintLayout.setBackgroundColor(Color.rgb(255, 0, 127));
        }else if(color.equalsIgnoreCase("LightGreen") || color.equalsIgnoreCase("Vert clair")) {
            constraintLayout.setBackgroundColor(Color.rgb(0, 255, 127));
        }else if(color.equalsIgnoreCase("LightPurple") || color.equalsIgnoreCase("Violet clair")) {
            constraintLayout.setBackgroundColor(Color.rgb(0, 255, 127));
        }else{
            constraintLayout.setBackgroundColor(Color.rgb(0,0,0));
            textView.setText(R.string.app_name);
        }


    }
}