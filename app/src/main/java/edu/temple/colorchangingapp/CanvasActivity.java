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

        textView = findViewById(R.id.textView_Color);
        constraintLayout = findViewById(R.id.contrainst_Layout);

        Intent toGet = getIntent();
        String color = toGet.getStringExtra("Color");
        textView.setText(color);

        switch (color){
            case "Red":
                constraintLayout.setBackgroundColor(Color.RED);
                break;
            case "Blue":
                constraintLayout.setBackgroundColor(Color.BLUE);
                break;
            case "Yellow":
                constraintLayout.setBackgroundColor(Color.YELLOW);
                break;
            case "Green":
                constraintLayout.setBackgroundColor(Color.GREEN);
                break;
            case "LightGrey":
                constraintLayout.setBackgroundColor(Color.LTGRAY);
                break;
            case "Magenta":
                constraintLayout.setBackgroundColor(Color.MAGENTA);
                break;
            case "White":
                constraintLayout.setBackgroundColor(Color.WHITE);
                break;
            case "Cyan":
                constraintLayout.setBackgroundColor(Color.CYAN);
                break;
            case "LightBlue":
                constraintLayout.setBackgroundColor(Color.rgb(0, 127, 255));
                break;
            case "Pink":
                constraintLayout.setBackgroundColor(Color.rgb(255, 0, 127));
                break;
            case "LightGreen":
                constraintLayout.setBackgroundColor(Color.rgb(0, 255, 127));
                break;
            case "LightPurple":
                constraintLayout.setBackgroundColor(Color.rgb(127, 127, 255));
                break;
            default:
                constraintLayout.setBackgroundColor(Color.rgb(0,0,0));
                textView.setText("There might be something wrong with clicking text view");
        }


    }
}