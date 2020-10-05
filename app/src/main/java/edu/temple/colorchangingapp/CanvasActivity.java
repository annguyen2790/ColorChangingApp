package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
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


    }
}