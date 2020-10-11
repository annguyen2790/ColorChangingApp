package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class PalletteActivity extends AppCompatActivity {
    GridView gridView;
    ColorAdapter colorAdapter;
    String [] colors = {"Red", "Blue" ,"Yellow",
                        "Green", "LightGrey", "Magenta",
                        "White", "Cyan", "LightBlue",
                        "Pink", "LightGreen", "LightPurple"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pallete_main);
        setTitle("Pallette Activity");
        /*Initialize objects*/

        /*Testing*/

        gridView = findViewById(R.id.GridView_Color);
        colorAdapter = new ColorAdapter(PalletteActivity.this, colors);
        gridView.setAdapter(colorAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent = new Intent(PalletteActivity.this, CanvasActivity.class);
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(PalletteActivity.this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                intent.putExtra("Color", adapterView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });

    }
}