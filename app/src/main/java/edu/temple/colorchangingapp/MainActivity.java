package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PalletteFragment.PListener {
    GridView gridView;
    ColorAdapter colorAdapter;
    TextView textViewInstruction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pallete_main);
        setTitle(R.string.PalletteActivity);
        Resources resources = getResources();
        String [] colours = resources.getStringArray(R.array.colors_array);
        //Create Pallete fragment using instance
        PalletteFragment pf = PalletteFragment.newInstance(colours);


        getSupportFragmentManager().beginTransaction().add(R.id.container_1, pf).commit();


    }

    @Override
    public void onInputPallette(String input) {
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }
}