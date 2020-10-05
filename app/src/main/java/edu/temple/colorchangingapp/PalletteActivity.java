package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class PalletteActivity extends AppCompatActivity {
    GridView gridView;
    ColorAdapter colorAdapter;
    String [] colors = {"Red", "Blue" ,"Green"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pallete_main);
        /*Initialize objects*/

        gridView = findViewById(R.id.GridView_Color);
        colorAdapter = new ColorAdapter(PalletteActivity.this, colors);
        gridView.setAdapter(colorAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PalletteActivity.this, "Clicked on Red", Toast.LENGTH_SHORT).show();
            }
        });

    }
}