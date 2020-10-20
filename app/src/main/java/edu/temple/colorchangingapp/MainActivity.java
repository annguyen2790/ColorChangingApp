package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PalletteFragment.PListener {
    GridView gridView;
    ColorAdapter colorAdapter;
    CanvasFragment canvas;
    PalletteFragment pf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pallete_main);
        setTitle(R.string.PalletteActivity);
        Resources resources = getResources();
        String [] colours = resources.getStringArray(R.array.colors_array);
        //Create Pallete fragment using instance
        pf = PalletteFragment.newInstance(colours);
        //Create Canvas fragment using normal initialization
        canvas = new CanvasFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.container_1, pf).add(R.id.container_2, canvas).commit();


    }

    @Override
    public void onInputPallette(String input) {
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
        Resources resources = getResources();
        String [] color = resources.getStringArray(R.array.colors_array);
        TextView textView = canvas.getView().findViewById(R.id.textView);
        if(input.equalsIgnoreCase(color[0])){
            canvas.getView().setBackgroundColor(Color.RED);
            textView.setText(color[0]);
        }
        else if(input.equalsIgnoreCase(color[1])){
            canvas.getView().setBackgroundColor(Color.BLUE);
            textView.setText(color[1]);
        }
        else if(input.equalsIgnoreCase(color[2])){
            canvas.getView().setBackgroundColor(Color.YELLOW);
            textView.setText(color[2]);
        }
        else if(input.equalsIgnoreCase(color[3])){
            canvas.getView().setBackgroundColor(Color.GREEN);
            textView.setText(color[3]);
        }
        else if(input.equalsIgnoreCase(color[4])){
            canvas.getView().setBackgroundColor(Color.LTGRAY);
            textView.setText(color[4]);
        }
        else if(input.equalsIgnoreCase(color[5])){
            canvas.getView().setBackgroundColor(Color.MAGENTA);
            textView.setText(color[5]);
        }
        else if(input.equalsIgnoreCase(color[6])){
            canvas.getView().setBackgroundColor(Color.WHITE);
            textView.setText(color[6]);
        }
        else if(input.equalsIgnoreCase(color[7])){
            canvas.getView().setBackgroundColor(Color.CYAN);
            textView.setText(color[7]);
        }
        else if(input.equalsIgnoreCase(color[8])) {
            canvas.getView().setBackgroundColor(Color.rgb(0, 127, 255));
            textView.setText(color[8]);

        }
        else if(input.equalsIgnoreCase(color[9])) {
            canvas.getView().setBackgroundColor(Color.rgb(255, 0, 127));
            textView.setText(color[9]);
        }
        else if(input.equalsIgnoreCase(color[10])) {
            canvas.getView().setBackgroundColor(Color.rgb(0, 255, 127));
            textView.setText(color[10]);
        }

        else if(input.equalsIgnoreCase(color[11])) {
            canvas.getView().setBackgroundColor(Color.rgb(127, 127, 255));
            textView.setText(color[11]);
        }

        else {
            canvas.getView().setBackgroundColor(Color.WHITE);
            textView.setText(R.string.app_name);
        }




    }
}